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
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int n = (a.length - i - 1) * (a.length - i - 2) / 2;
            v.add(n);
            // System.out.println(n);
        }

        for (int i = 1; i < v.size(); i++) {
            v.set(i, v.get(i) + v.get(i - 1));
            // System.out.println(v.get(i) + v.get(i - 1));
        }

        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < v.size(); j++) {
                if (q[i] <= v.get(j)) {
                    System.out.println(a[j]);
                    break;
                }
            }
        }
    }
}
