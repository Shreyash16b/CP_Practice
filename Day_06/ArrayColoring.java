package CP_Practice.Day_06;

import java.util.Scanner;

public class ArrayColoring {
    public static void solve(int[] a, int n) {
        int odd = 0;
        for (int i : a) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        if (odd % 2 == 0) {
            System.out.println("YES");
            return;
        } else {
            System.out.println("NO");
        }
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
            solve(a, n);
        }
    }
}
