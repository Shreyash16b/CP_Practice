package CP_Practice.Day_16;

import java.util.*;

public class BeautifulTower {
    public static long maximum(List<Integer> max) {
        int n = max.size();
        long[] left = new long[n], right = new long[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int mh = max.get(i);
            while (!st.isEmpty() && max.get(st.peek()) >= mh) {
                st.pop();
            }
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
        long ans = 0;
        for (int j = 0; j < n; j++) {
            ans = Math.max(ans, left[j] + right[j] - max.get(j));
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(528947205, 446572672, 245562434, 29067688, 230940022, 237916991, 546243960,
                898360263, 110809423, 616740838, 141189952, 272319413, 173945434, 944209607, 709147298, 291516002,
                697109513, 945372506, 321357175, 271013697, 140905315, 154122459, 745184252, 379717676, 468969774,
                302949377, 261867781, 933328834, 791272529, 583341139, 83259489, 304055888, 873655860, 808520318,
                194518325, 703266873, 281331446, 927210596, 422874036, 902047413, 774474564, 809609201, 493545785,
                415250991, 884864225, 392444408, 610159103, 903379193, 816412790, 591760883, 361140449, 759810143,
                588717612, 694204370, 42665571, 517507625, 702706955, 952884579);
        System.out.println(maximum(l));
    }

}
