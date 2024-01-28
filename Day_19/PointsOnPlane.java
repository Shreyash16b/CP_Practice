package CP_Practice.Day_19;

import java.util.Scanner;

public class PointsOnPlane {
    public static void solve(long n) {
        long l = 0;
        long h = (long) Math.pow(10, 10);
        while (l <= h) {
            long mid = l + (h - l) / 2;
            if ((mid + 1) * (mid + 1) >= n)
                h = mid - 1;
            else
                l = mid + 1;
        }
        System.out.println(l);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc.nextLong());
        }
    }
}
