package CP_Practice.Day_08;

import java.util.*;

public class StrongPassword {
    private static void solve(String s, int m, String l, String r) {
        int n = s.length();
        int max = 0;

        for (int i = 0; i < m; i++) {
            int low = (int) l.charAt(i);
            int high = (int) r.charAt(i);

            int newmax = max;
            for (int j = low; j <= high; j++) {
                int curr = max;
                while (curr < n && (int) s.charAt(curr) != j) {
                    curr++;
                }
                newmax = Math.max(newmax, curr);
            }

            max = newmax + 1;
        }

        if (max > n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int m = sc.nextInt();
            String l = sc.next();
            String r = sc.next();
            solve(s, m, l, r);
        }
    }
}
