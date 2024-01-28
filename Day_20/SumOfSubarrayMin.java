package CP_Practice.Day_20;

import java.util.Stack;

public class SumOfSubarrayMin {

    public static long sumSubarrayMins(int[] arr) {
        long res = 0;

        Stack<Integer> index = new Stack<>();
        long mod = (int) Math.pow(10, 9) + 7;

        for (int i = 0; i <= arr.length - 1; i++) {
            while (!index.isEmpty() && arr[i] <= arr[index.peek()]) {
                long j = index.pop();
                long right = i - j;
                long left = !index.isEmpty() ? j - index.peek() : j + 1;
                res = (res + arr[(int) j] * left * right) % mod;
            }
            index.push(i);
        }

        for (int i = 0; i < index.size(); i++) {
            long j = index.elementAt(i);
            long left = (i > 0) ? j - index.elementAt(i - 1) : j + 1;
            long right = arr.length - j;
            res = (res + arr[(int) j] * left * right) % mod;
        }
        System.out.println(res);
        return (int) res;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        long a = sumSubarrayMins(nums);
    }

}
