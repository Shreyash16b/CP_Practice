package CP_Practice.Day_13;

public class BuildingAquarium {

    public static void main(String[] args) {
        int[] col = { 3, 1, 2, 4, 6, 2, 5 };
        findH(7, 9, col);
    }

    public static void findH(int n, int x, int[] col) {
        if (n == 1) {
            System.out.println(x + col[0]);
            return;
        }
        int lo = 0, hi = x + col[0];
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            int curr = calculate(mid, col);

            if (curr > x) {
                System.out.println("1" + " " + curr);
                hi = mid;
            } else if (curr < x) {
                System.out.println("2" + " " + curr);
                lo = mid + 1;
            } else if (curr == x) {
                System.out.println(mid);
                return;
            }
            if (lo == hi) {
                System.out.println(lo);
                return;
            }
        }

    }

    public static int calculate(int h, int[] col) {
        int ans = 0;
        for (int i = 0; i < col.length; i++) {
            if (col[i] < h) {
                ans += h - col[i];
            }
        }
        return ans;
    }
}