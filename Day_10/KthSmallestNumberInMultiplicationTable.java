package CP_Practice.Day_10;

public class KthSmallestNumberInMultiplicationTable {
    public static int findKthNumber(int m, int n, int k) {
        int res = 0;

        int lo = 1, hi = m * n;
        while (lo < hi) {
            int c = 0;
            int mid = lo + (hi - lo) / 2;
            // System.out.println(mid);
            for (int i = 1; i <= Math.min(m, mid); i++) {
                c += Math.min(n, mid / i);
            }

            // System.out.println(c);
            if (c >= k) {
                hi = mid;

            } else {
                lo = mid + 1;
            }

            if (lo == hi) {
                res = lo;
                break;
            }
        }
        // System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        findKthNumber(4, 4, 3);
    }
}
