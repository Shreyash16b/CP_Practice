package CP_Practice.Day_12;

import java.util.Scanner;

public class PerfectTeam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            solve(c, m, x);
        }
    }

    public static void solve(int c, int m, int x) {
        int t = Math.min(c, Math.min(m, x));

        x -= t;
        m -= t;
        c -= t;

        if (m == 0 || c == 0) {
            System.out.println(t);
            return;
        }
        if (c >= 2 * m) {
            t += m;
            System.out.println(t);
            return;
        }
        if (m >= 2 * c) {
            t += c;
            System.out.println(t);
            return;
        }

        t += (c + m) / 3;
        System.out.println(t);
        return;
    }
}
