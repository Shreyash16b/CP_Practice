package CP_Practice.Day_02;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = { 8308, 8308, 830 };
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            res.add(String.valueOf(nums[i]));
            if (nums[i] == 0) {
                z++;
            }
        }
        Collections.sort(res, (s1, s2) -> -(s1 + s2).compareTo(s2 + s1));
        String ans = "";
        for (String s : res) {
            ans += s;
        }
        if (z == nums.length) {
            return "0";
        }
        return ans;
    }

}
