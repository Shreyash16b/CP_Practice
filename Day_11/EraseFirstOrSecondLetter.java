package CP_Practice.Day_11;

import java.util.*;

public class EraseFirstOrSecondLetter {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                sc.nextInt();
                String s = sc.next();
                solve(s);
            }
        }
    }

    public static void solve(String s) {
        Set<Character> c = new HashSet<Character>();
        int sum = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            c.add(s.charAt(i));
            l = c.size();
            sum += l;
        }
        System.out.println(sum);
        return;
    }
}
