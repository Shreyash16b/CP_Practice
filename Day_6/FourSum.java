package CP_Practice.Day_6;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // if (j > 1 && nums[j] == nums[j - 1]) {
                // continue;
                // }
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    if ((long) nums[i] + nums[j] + nums[l] + nums[r] > target) {
                        r--;
                    } else if ((long) nums[i] + nums[j] + nums[l] + nums[r] < target) {
                        l++;
                    } else {
                        if (!res.contains(Arrays.asList(nums[i], nums[j], nums[l], nums[r]))) {
                            // System.out.println((long) nums[i] + nums[j] + nums[l] + nums[r]);
                            res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        }
                        l++;
                        r--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = { 1000000000, 1000000000, 1000000000, 1000000000 };
        List<List<Integer>> ans = fourSum(a, -294967296);
        System.out.println(ans);
    }
}