package CP_Practice.Day_4;

import java.util.*;

public class CollectingGame {

    public static void solve(int n, int[] a) {
        long sum = 0;
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
            sum += a[i];
        }

        Arrays.sort(b);

        HashMap<Integer, Integer> ind = new HashMap<>();
        int prev = 0;
        boolean c = false;

        for (int i = 0; i < n; i++) {
            sum -= b[n - i - 1];

            if (c) {
                ind.put(b[n - 1 - i], prev);
            } else {
                ind.put(b[n - 1 - i], n - 1 - i);
                prev = n - i - 1;
            }

            if (sum >= b[n - 1 - i]) {
                c = true;
            } else {
                c = false;
            }
        }

        for (int i : a) {
            System.out.print(ind.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(n, a);
        }
    }
}
