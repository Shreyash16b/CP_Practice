package CP_Practice.Day_06;

import java.util.Scanner;

public class PermutationSwap {
    public static int findGCD(int x, int y) {
        int r = 0, a, b;
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

    public static void solve(int[] a) {
        int ans = 0;
        for (int i = 0; i < a.length && a[i] - i != 1; i++) {
            if (ans == 0) {
                ans = a[i] - i - 1;
            }
            ans = findGCD(ans, Math.abs(a[i] - i - 1));
        }
        System.out.println(ans);
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
            solve(a);
        }
        // int[] b = { 4, 2, 6, 7, 5, 3, 1 };
        // solve(b);
    }
}
