package CP_Practice.Day_11;

import java.util.*;

public class FlowerCityFence {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] v = new int[n];
                for (int i = 0; i < n; i++) {
                    v[i] = sc.nextInt();
                }
                solve(v);
            }
        }
    }

    public static void solve(int[] v) {
        if (v[0] != v.length) {
            System.out.println("NO");
            return;
        }
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            r[v[i] - 1]++;
        }

        for (int i = v.length - 2; i >= 0; i--) {
            r[i] += r[i + 1];
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] != r[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;
    }
}
