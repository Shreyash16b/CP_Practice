package CP_Practice.Day_04;

import java.util.Scanner;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            solve(k, a);
        }
    }

    private static void solve(int k, int[] a) {
        int min = Integer.MAX_VALUE;
        int even = 0;
        for (int i : a) {
            if (i % 2 == 0)
                even++;
            if ((i % k) == 0) {
                min = 0;
                break;
            } else {
                min = Math.min(min, k - i % k);
            }
        }

        if (k == 4) {
            if (even >= 2) {
                min = 0;
            } else if (even == 1) {
                min = Math.min(min, 1);
            } else {
                min = Math.min(min, 2);
            }
        }
        System.out.println(min);
    }
}
