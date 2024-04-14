package CP_Practice.Day_24;

import java.util.Scanner;
import java.util.Stack;

public class CdPwdCommands {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<String> path = new Stack<>();
        while (t-- > 0) {
            String com = sc.next();
            // System.out.println(com);
            if (com.equals("pwd")) {
                System.out.println();
                Stack<String> temp = new Stack<>();
                while (!path.isEmpty()) {
                    temp.push(path.pop());
                }
                System.out.print("/");
                while (!temp.isEmpty()) {
                    path.push(temp.peek());
                    System.out.print(temp.pop() + "/");
                }
            } else {

                String p = sc.next();
                if (p.charAt(0) == '/') {
                    path.clear();
                }
                String[] pa = p.split("/", 0);

                for (String a : pa) {
                    if (a.equals("..")) {
                        path.pop();
                    } else if (a.isBlank()) {
                        continue;
                    } else {
                        path.push(a);
                    }
                }

            }
        }
    }
}
