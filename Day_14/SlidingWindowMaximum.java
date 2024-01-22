package CP_Practice.Day_14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] a = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int[] b = maxSlidingWindow(a, 3);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> op = new ArrayList<>();
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> window = new ArrayDeque<Integer>();
        int left = 0, right = 0;
        while (right < nums.length) {
            while (!window.isEmpty() && nums[window.getLast()] < nums[right]) {
                window.removeLast();
                // System.out.println(window.getLast() + " " + nums[window.removeLast()] + " " +
                // nums[right]);
            }
            window.add(right);
            // System.out.println(window.toString());

            if (window.getFirst() < left) {
                // window.removeFirst();
                System.out.println(window.removeFirst());
            }
            if (right + left >= k - 1) {
                // System.out.println(nums[right] + " " + nums[left]);
                op.add(nums[window.getFirst()]);
                left++;
            }
            right++;

        }
        System.out.println(op);
        return res;
    }
}
