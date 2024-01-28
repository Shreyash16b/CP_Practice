package CP_Practice.Day_17;

import java.util.Arrays;
import java.util.Scanner;

public class Streetlights {
    public static void solve(int n, int l, int[] p) {
        Arrays.sort(p);
        double min = p[0];
        for (int i = 0; i < p.length - 1; i++) {
            min = Math.max(min, (p[i + 1] - p[i]) / 2.0);
        }
        if (p[p.length - 1] != l) {
            min = Math.max(min, (l - p[p.length - 1]));
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        solve(n, l, p);
    }
}
