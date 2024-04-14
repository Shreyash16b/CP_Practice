package CP_Practice.Day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Incinerate {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] h = new int[n];
                int[] p = new int[n];
                for (int i = 0; i < n; i++) {
                    h[i] = sc.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    p[i] = sc.nextInt();
                }
                solve(n, k, h, p);
            }
        }
    }

    public static void solve(int n, int k, int[] h, int[] p) {
        ArrayList<ArrayList<Integer>> monster = new ArrayList<ArrayList<Integer>>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (h[i] > max)
                max = h[i];
            monster.add(new ArrayList<>(List.of(h[i], p[i])));
        }
        Collections.sort(monster, Comparator.comparingInt(row -> row.get(1)));
        int dmg = k;
        int newdmg = k;
        int in = 0;

        // System.out.println(monster);
        while (true) {
            if (dmg >= monster.get(in).get(0)) {
                while (in < n && dmg >= monster.get(in).get(0)) {
                    in++;
                }
            }
            if (in >= n) {
                System.out.println("YES");
                return;
            }
            dmg += newdmg - monster.get(in).get(1);
            newdmg = newdmg - monster.get(in).get(1);

            if (newdmg <= 0) {
                System.out.println("NO");
                return;
            }
        }
    }
}
