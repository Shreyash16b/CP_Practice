package CP_Practice.Day_20;

import java.util.*;

public class SumOfSubarrayRanges {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        System.out.println(subArrayRanges(a));
        ;
    }

    public static long subArrayRanges(int[] arr) {
        long res = 0;

        Stack<Integer> index = new Stack<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            while (!index.isEmpty() && arr[i] <= arr[index.peek()]) {
                long j = index.pop();
                long right = i - j;
                long left = !index.isEmpty() ? j - index.peek() : j + 1;
                res = (res + arr[(int) j] * left * right);
            }
            index.push(i);
        }
        Stack<Integer> index2 = new Stack<>();
        long res2 = 0;
        for (int i = 0; i < index.size(); i++) {
            long j = index.elementAt(i);
            long left = (i > 0) ? j - index.elementAt(i - 1) : j + 1;
            long right = arr.length - j;
            res = (res + arr[(int) j] * left * right);
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            while (!index2.isEmpty() && arr[i] >= arr[index2.peek()]) {
                long j = index2.pop();
                long right = i - j;
                long left = !index2.isEmpty() ? j - index2.peek() : j + 1;
                res2 = (res2 + arr[(int) j] * left * right);
            }
            index2.push(i);
        }

        for (int i = 0; i < index2.size(); i++) {
            long j = index2.elementAt(i);
            long left = (i > 0) ? j - index2.elementAt(i - 1) : j + 1;
            long right = arr.length - j;
            res2 = (res2 + arr[(int) j] * left * right);
        }
        // System.out.println(res + " " + res2);
        return res2 - res;
    }
}
