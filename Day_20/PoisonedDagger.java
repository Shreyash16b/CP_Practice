package CP_Practice.Day_20;

import java.util.ArrayList;
import java.util.Scanner;

public class PoisonedDagger {

    public static void solve(ArrayList<Long> a, long h) {
        long lo = 1, hi = h;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long dmg = 0;
            for (int i = 0; i < a.size() - 1; i++) {
                dmg += (a.get(i) + mid > a.get(i + 1)) ? a.get(i + 1) - a.get(i) : mid;
            }
            dmg += mid;
            if (dmg >= h)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        System.out.println(lo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long h = sc.nextLong();
            ArrayList<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }
            solve(a, h);
        }
    }

}
