package CP_Practice.Day_5;

import java.util.*;

public class LukeIsAFoodie {
    public static void solve(int[] a, int x) {
        int lo = a[0] - x;
        int hi = a[0] + x;
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            int currlo = a[i] - x;
            int currhi = a[i] + x;
            // System.out.println(currhi + " " + currlo + " " + hi + " " + lo);
            if (currhi < lo || currlo > hi) {
                ans++;
                // System.out.println(ans);
                lo = currlo;
                hi = currhi;
            } else {
                if (currlo > lo)
                    lo = currlo;
                if (currhi < hi)
                    hi = currhi;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            solve(a, x);
        }
    }
}
