package CP_Practice.Day_13;

import java.util.Scanner;

public class BuildingAquarium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            findH(n, x, a);
        }
    }

    public static void findH(int n, int x, int[] col) {
        if (n == 1) {
            System.out.println(x + col[0]);
            return;
        }
        int min = col[0];
        for (int i = 0; i < col.length; i++) {
            if (min > col[i])
                min = col[i];
        }
        int lo = 0, hi = (int) Math.pow(10, 10);
        System.out.println(lo + " " + hi);

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int curr = calculate(mid, col);

            if (curr > x) {
                System.out.println("1" + " " + curr);
                hi = mid;
            } else if (curr < x) {
                System.out.println("2" + " " + curr);
                lo = mid;
            }
            // else if (curr == x) {
            // System.out.println(mid);
            // return;
            // }

        }
        System.out.println(lo);
        return;
    }

    public static int calculate(int h, int[] col) {
        int ans = 0;
        for (int i = 0; i < col.length; i++) {
            if (col[i] < h) {
                ans += h - col[i];
            }
        }
        return ans;
    }
}