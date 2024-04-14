package CP_Practice.March_20;

import java.util.Scanner;

public class RudolfAnd121 {
    public static void solve(int n, int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // System.out.println(i);
            if (arr[i] == 0)
                continue;
            if (arr[i - 1] * 2 > arr[i]) {
                System.out.println("NO\n");
                return;
            } else {
                arr[i] -= arr[i - 1] * 2;
                arr[i + 1] -= arr[i - 1];
                arr[i - 1] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("NO\n");
                return;
            }
        }
        System.out.println("YES");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int i = sc.nextInt();
            int[] arr = new int[i];
            for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();
        }
            solve(i, arr);
        }
    }
}
