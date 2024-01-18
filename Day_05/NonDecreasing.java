package CP_Practice.Day_5;

public class NonDecreasing {

    private static boolean solve(int[] nums) {
        boolean changed = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                if (changed) {
                    return false;
                }

                if (i == 0 || nums[i + 1] >= nums[i - 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
                changed = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 2, 3 }; // 1, 5, 4, 6, 7, 10, 8, 9 and 3,4,2,3
        System.out.println(solve(a));
    }

}
