package CP_Practice.Day_2;

import java.util.Scanner;

public class SmallerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[a];
        int[] B = new int[b];

        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            B[i] = sc.nextInt();
        }

        if (A[k - 1] < B[b - m]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
