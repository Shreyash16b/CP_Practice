package CP_Practice.Day_09;

import java.util.Arrays;
import java.util.*;

public class BasketballTogether {

    private static void solve(int[] powers, int d) {
        Arrays.sort(powers);
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < powers.length; i++) {
            p.add(powers[i]);
        }
        int ans = 0;
        while (!p.isEmpty()) {
            int x = d / p.get(p.size() - 1);
            if (x + 1 > p.size()) {
                System.out.println(x + " " + p.size());
                break;
            }
            ans++;
            p.remove(p.size() - 1);
            for (int j = 0; j < x; j++) {
                p.remove(0);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] powers = new int[n];
        for (int i = 0; i < n; i++) {
            powers[i] = sc.nextInt();
        }
        solve(powers, d);
        // }
    }

}