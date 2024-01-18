package CP_Practice.Day_03;

import java.util.Scanner;

public class ArraySharpened {

    public static void Sharpen(int[] a) {
        int lar = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                lar++;
            } else {
                break;
            }
        }
        boolean isSharp = true;
        for (int i = lar; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                isSharp = false;
                break;
            }
        }

        if (isSharp)
            System.out.println("Yes");
        else {
            int left = 0, right = 0;

            for (int i = 0; i < a.length; i++) {
                if (a[i] >= i) {
                    left = i;
                } else {
                    break;
                }
            }

            for (int i = a.length - 1; i > 0; i--) {
                if (a[i] >= a.length - 1 - i) {
                    right = i;
                } else {
                    break;
                }
            }

            if (left >= right) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Sharpen(arr);
        }
    }

}
