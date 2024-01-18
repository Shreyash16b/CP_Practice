package CP_Practice.Day_02;

import java.util.Scanner;

public class ProductSubarray {

    public static void product(int[] arr) {
        int neg = 0;
        int n1 = 0, n2 = 0, n3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg++;
            }
        }
        if (neg % 2 != 0) {
            n1 = 1;
            n3 = 1;
            n2 = arr.length - 2;

            int[] negprod = new int[n1];
            int[] zeroprod = new int[n3];
            int[] posprod = new int[n2];
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0 && negprod[0] == 0) {
                    negprod[0] = arr[i];
                } else if (arr[i] != 0) {
                    posprod[j] = arr[i];
                    j++;
                }
            }
            System.out.print(n1 + " " + negprod[0] + "\n" + n2 + " ");
            for (int i = 0; i < posprod.length; i++) {
                System.out.print(posprod[i] + " ");
            }
            System.out.print("\n" + n3 + " " + zeroprod[0]);
        }

        else {
            n1 = 1;
            n3 = 2;
            n2 = arr.length - 3;

            int[] negprod = new int[n1];
            int[] zeroprod = new int[n3];
            int[] posprod = new int[n2];
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0 && negprod[0] == 0) {
                    negprod[0] = arr[i];
                } else if (arr[i] < 0 && zeroprod[1] == 0) {
                    zeroprod[1] = arr[i];
                } else if (arr[i] != 0) {
                    posprod[j] = arr[i];
                    j++;
                }
            }

            System.out.print(n1 + " " + negprod[0] + "\n" + n2 + " ");
            for (int i = 0; i < posprod.length; i++) {
                System.out.print(posprod[i] + " ");
            }
            System.out.print("\n" + n3 + " " + zeroprod[0] + " " + zeroprod[1]);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        product(arr);

    }

}
