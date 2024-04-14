package CP_Practice.Day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Greetings {
    public static void solve(int[] a, int[] b) {
        int ans = 0;
        ArrayList<ArrayList<Integer>> pos = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < a.length; i++) {
            pos.add(new ArrayList<>(Arrays.asList(a[i], b[i])));
        }

        Collections.sort(pos, Comparator.comparingInt(row -> row.get(0)));
        TreeSet<Integer> set = new TreeSet<>();
        for (ArrayList l : pos) {
            set.add((int) l.get(1));
        }

        for (int i = 0; i < a.length; i++) {
            ans += set.headSet(pos.get(i).get(1)).size();
            set.remove(pos.get(i).get(1));
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            solve(a, b);
        }
    }
}
