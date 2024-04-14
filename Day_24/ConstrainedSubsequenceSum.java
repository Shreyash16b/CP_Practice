package CP_Practice.Day_24;

import java.util.*;

public class ConstrainedSubsequenceSum {

    public static void main(String[] args) {
        int[] a = { 10, 2, -10, 5, 20 };
        System.out.println(constrainedSubsetSum(a, 2));
    }

    public static int constrainedSubsetSum(int[] nums, int k) {
        int ans = nums[0];
        int curmax = 0;
        Comparator<List<Integer>> listComparator = Comparator.comparing(list -> list.get(0));

        PriorityQueue<List<Integer>> max = new PriorityQueue<>(listComparator.reversed());
        max.add(Arrays.asList(nums[0], 0));

        for (int i = 1; i < nums.length; i++) {
            while (!max.isEmpty() && i - max.peek().get(1) > k) {
                max.remove();
            }

            curmax = Math.max(nums[i], nums[i] + max.peek().get(0));
            ans = Math.max(ans, curmax);
            max.add(Arrays.asList(curmax, i));
        }
        return ans;
    }
}
