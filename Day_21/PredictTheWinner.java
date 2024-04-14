package CP_Practice.Day_21;

public class PredictTheWinner {
    int[][] m = new int[21][21];

    public int solve(int[] nums, int i, int j) {
        if (i > j)
            return 0;
        if (i == j)
            return nums[i];
        if (m[i][j] != -1)
            return m[i][j];
        int take_i = nums[i] - solve(nums, i + 1, j);
        int take_j = nums[j] - solve(nums, i, j - 1);

        return Math.max(take_i, take_j);
    }

    public boolean predictTheWinner(int[] nums) {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                m[i][j] = -1;
            }
        }
        boolean res = solve(nums, 0, nums.length) >= 0;
        return res;
    }

   
}
