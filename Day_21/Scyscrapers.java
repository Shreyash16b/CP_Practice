package CP_Practice.Day_21;

import java.util.*;

public class Scyscrapers {
    public static long maximumSumOfHeights(List<Integer> max) {
        int n = max.size();
        long[] left = new long[n], right = new long[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int mh = max.get(i);
            while (!st.isEmpty() && max.get(st.peek()) >= mh)
                st.pop();
            left[i] = st.isEmpty() ? (long) (i + 1) * mh : left[st.peek()] + (long) (i - st.peek()) * mh;
            st.push(i);
        }

        Stack<Integer> st2 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int mh = max.get(i);
            while (!st2.isEmpty() && mh <= max.get(st2.peek())) {
                st2.pop();
            }
            right[i] = st2.isEmpty() ? (long) (n - i) * mh : right[st2.peek()] + (long) (st2.peek() - i) * mh;
            st2.push(i);
        }
        int m = 0;
        long ans = 0;
        for (int j = 0; j < n; j++) {
            System.out.println(left[j] + " " + right[j]);
            if (left[j] + right[j] - max.get(j) > ans) {
                m = j;
            }
            ans = Math.max(ans, left[j] + right[j] - max.get(j));
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(6);
        l.add(8);
        // l.add(2);
        // l.add(1);

        System.out.println(maximumSumOfHeights(l));
        ;
    }
}
