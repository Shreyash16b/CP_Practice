package CP_Practice.Day_03;

import java.util.Arrays;
import java.util.Scanner;

public class SongsCompression {

    public static void compressSong(int max, int[] initial, int[] diff) {
        long sum = 0;
        for (int k : initial) {
            sum += k;
        }

        Arrays.sort(diff);
        for (int i = 0; i < diff.length / 2; i++) {
            int temp = diff[i];
            diff[i] = diff[diff.length - 1 - i];
            diff[diff.length - 1 - i] = temp;
        }
        int j = 0;
        while (sum > max) {
            if (j == diff.length) {
                j = -1;
                break;
            }
            sum -= diff[j];
            j++;
        }
        System.out.println(j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int t = sc.nextInt();

//        while (t-- > 0) {
        int n = sc.nextInt();
        int maxStorage = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }
        compressSong(maxStorage, a, c);
//        }
    }
}

