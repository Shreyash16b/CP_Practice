package CP_Practice.Day_19;

import java.util.*;

public class Pattern132 {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2 };
        System.out.println(find132pattern(nums));
        ;
    }

    public static boolean find132pattern(int[] nums) {
        boolean res = false;
        int m = nums[0];
        if (nums.length <= 2)
            return false;

        Stack<List<Integer>> a = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!a.isEmpty() && nums[i] >= a.peek().get(0)) {
                a.pop();
            }
            if (!a.isEmpty() && nums[i] > a.peek().get(1)) {
                return true;
            }

            a.push(Arrays.asList(nums[i], m));
            m = Math.min(m, nums[i]);
        }

        return res;
    }
}
