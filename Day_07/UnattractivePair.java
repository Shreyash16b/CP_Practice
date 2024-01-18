package CP_Practice.Day_7;

import java.util.Scanner;

public class UnattractivePair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            // System.out.println(t + " " + n + " " + s);
            solve(s);
        }
        // solve("avbvvcvvvd");
    }

    private static void solve(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[(int) s.charAt(i) - 97]++;
        }

        int max = 0;
        for (int i : freq) {
            if (max < i) {
                max = i;
            }
        }

        // System.out.println(max);

        if (max <= s.length() / 2) {
            System.out.println(s.length() % 2);
        } else {
            System.out.println(s.length() - (s.length() - max) * 2);
        }
    }

}
