package CP_Practice.Day_25;

import java.util.Scanner;

public class PermutationTransformation {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] res = new int[n];
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            calculateDepth(0, n, 0, arr, res);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]);
            }
            System.out.println();
        }
    }

    public static void calculateDepth(int i, int j, int d, int[] arr, int[] res) {
        // System.out.println(i + " " + j + " " + d);
        if (i > j) {
            return;
        }
        int index = -2;
        int val = Integer.MIN_VALUE;
        for (int m = i; m < j; m++) {
            if (arr[m] >= val) {
                val = arr[m];
                index = m;
            }
        }
        if (index < 0) {
            return;
        }
        res[index] = d;
        calculateDepth(i, index - 1, d + 1, arr, res);
        calculateDepth(index + 1, j, d + 1, arr, res);
    }
}
