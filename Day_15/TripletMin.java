package CP_Practice.Day_15;

import java.util.*;

public class TripletMin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int nq = sc.nextInt();
                int[] a = new int[n];
                int[] q = new int[nq];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                for (int i = 0; i < nq; i++) {
                    q[i] = sc.nextInt();
                }
                solve(a, q);
            }
        }
    }

    public static void solve(int[] a, int[] q) {
        Arrays.sort(a);
        ArrayList<Long> v = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            long n = (a.length - i - 1) * (a.length - i - 2) / 2;
            v.add(n);
            // System.out.println(n);
        }

        for (int i = 1; i < v.size(); i++) {
            v.set(i, v.get(i) + v.get(i - 1));
            // System.out.println(v.get(i) + v.get(i - 1));
        }

        // System.out.println(v);
        for (int i = 0; i < q.length; i++) {
            int lo = 0, hi = v.size() - 1;
            int mid = lo + (hi - lo) / 2;
            while (lo < hi) {
                // System.out.println(mid + " " + hi + " " + lo);
                mid = lo + (hi - lo) / 2;
                if (v.get(mid) < q[i]) {
                    lo = mid;
                } else if (v.get(mid) > q[i]) {
                    hi = mid;
                }
                if (v.get(mid) == q[i]) {
                    break;
                }
                if (lo == hi) {
                    break;
                }
            }
            System.out.println(a[mid]);
        }
    }
}
