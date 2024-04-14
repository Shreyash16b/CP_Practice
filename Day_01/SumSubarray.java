package CP_Practice.Day_01;
import java.util.Scanner;

public class SumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int currsum = arr[0];
            int maxsum = arr[0];
            boolean even = (arr[0] % 2 == 0);

            for (int i = 1; i < n; i++) {
                if ((even && arr[i] % 2 != 0) || (!even && arr[i] % 2 == 0)) {
                    if (currsum < 0) {
                        currsum = arr[i];
                    } else {
                        currsum += arr[i];
                    }
                    if (currsum > maxsum) {
                        maxsum = currsum;
                    }

                 even = !even;

                } else {
                    currsum = arr[i];
                    even = arr[i] % 2 == 0;
                    if (arr[i] > maxsum) {
                        maxsum = arr[i];
                    }
                }
            }

            System.out.println(maxsum);
        }

    }
}