package CP_Practice.Day_01;
import java.util.*;
import java.lang.*;

class InterestingValue {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long inmax, inmin, negmin;
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            inmax = arr[n - 1] * arr[n - 1];
            inmin = arr[0] * arr[0];
            negmin = arr[n - 1] * arr[0];


            long min = Math.min(inmin, Math.min(inmax, negmin));
            long max = Math.max(inmax, inmin);

            System.out.println(min + " " + max);
        }
    }
}
