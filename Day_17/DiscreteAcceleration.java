package CP_Practice.Day_17;

import java.util.Scanner;

public class DiscreteAcceleration {
    public static void solve(int n, int[] a, int l) {
        double sp = 0, ep = l, ss = 1, es = 1, t = 0;
        int i = 0, j = n - 1;
        while (i <= j) {
            int sf = a[i], ef = a[j];
            double d1 = sf - sp;
            double d2 = ep - ef;
            double t1 = d1 / ss;
            double t2 = d2 / es;

            if (t1 >= t2) {
                es++;
                ep = ef;
                j--;
                sp += t2 * ss;
                t += t2;
            } else {
                ss++;
                sp = sf;
                i++;
                ep -= t1 * es;
                t += t1;
            }
        }
        t += (ep - sp) / (es + ss);
        System.out.println(String.format("%.15f", t));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(n, a, l);
        }
    }
}
