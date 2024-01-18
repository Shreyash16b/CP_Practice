package CP_Practice.Day_4;

public class MinMovesToEqualArray {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        int moves = 0;
        for (int i = 0; i < n; i++) {
            moves += nums[i] - min;
        }
        return moves;
    }
}
