package CP_Practice.Day_13;

public class SuperEggDrop {
    static int[][] matrix = new int[101][10001];

    public static int superEggDrop(int k, int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = -1;
            }
        }
        int ans = solve(k, n);
        // System.out.println(ans);
        return ans;
    }

    public static int solve(int e, int f) {
        if (f <= 1 || e == 1)
            return f;
        if (matrix[e][f] != -1)
            return matrix[e][f];

        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < f; i++) {
            int low = 0, high = 0;
            if (matrix[e - 1][i - 1] == -1) {
                low = solve(e - 1, i - 1);
                matrix[e - 1][i - 1] = low;
            } else {
                low = matrix[e - 1][i - 1];
            }

            if (matrix[e][f - i] == -1) {
                low = solve(e, f - i);
                matrix[e][f - i] = high;
            } else {
                high = matrix[e][f - i];
            }
            int temp = 1 + Math.max(low, high);
            ans = Math.min(temp, ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        int s = superEggDrop(3, 14);
        System.out.println(s);
    }
}
