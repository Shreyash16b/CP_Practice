package CP_Practice.Day_05;

import java.util.Scanner;

public class PaintTheArray {

    public static long findGCD(long x, long y) {
        long r = 0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    public static void solve(long[] a) {
        long evengcd = a[0];
        long oddgcd = a[1];

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                evengcd = findGCD(evengcd, a[i]);
            } else {
                oddgcd = findGCD(oddgcd, a[i]);
            }
        }

        for (int i = 0; i < a.length; i += 2) {
            if (a[i] % oddgcd == 0) {
                oddgcd = 0;
                break;
            }
        }

        for (int i = 1; i < a.length; i += 2) {
            if (a[i] % evengcd == 0) {
                evengcd = 0;
                break;
            }
        }

        if (evengcd != 0) {
            System.out.println(evengcd);
            return;
        } else if (oddgcd != 0) {
            System.out.println(oddgcd);
            return;
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            solve(a);
        }
    }

}
