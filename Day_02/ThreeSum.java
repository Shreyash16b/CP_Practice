package CP_Practice.Day_2;

import java.util.*;

class ThreeSum {

    public static void main(String[] args) {
        int[] arr = { -2, 0, 1, 1, 2 };
        List<List<Integer>> res = threeSum(arr);
        for (List<Integer> i : res) {
            System.out.println(i);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (left != i + 1 && nums[left] == nums[left - 1]) {
                    left++;
                } else if ((right != nums.length - 1 && nums[right] == nums[right + 1])) {
                    right--;
                }

                else {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                    }

                    else if (sum > 0) {
                        right--;
                    }

                    else {
                        left++;
                    }
                }

            }

        }
        return res;
    }
}
