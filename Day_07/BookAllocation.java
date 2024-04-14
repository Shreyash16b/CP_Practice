package CP_Practice.Day_07;

import java.util.*;

public class BookAllocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = findPages(a, n, m);
        System.out.println(t);
    }

    static boolean isPossible(int arr[], int n, int m, int curr_min) {
        int cntStudents = 1;
        int curSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > curr_min)
                return false;

            if (curSum + arr[i] > curr_min) {
                cntStudents++;
                curSum = arr[i];
                if (cntStudents > m)
                    return false;
            } else
                curSum += arr[i];
        }

        return true;
    }

    static int findPages(int arr[], int n, int m) {
        long sum = 0;
        if (n < m)
            return -1;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        int start = 0, end = (int) sum;
        int result = Integer.MAX_VALUE;
        while (start <= end) {

            int mid = (start + end) / 2;
            if (isPossible(arr, n, m, mid)) {
                result = mid;

                end = mid - 1;
            } else
                start = mid + 1;
        }

        return result;
    }

}
