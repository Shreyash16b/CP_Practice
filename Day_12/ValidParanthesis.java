package CP_Practice.Day_12;

public class ValidParanthesis {
    public int minAddToMakeValid(String s) {
        int op = 0, cl = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                op++;
            } else if (s.charAt(i) == ')' && op > 0) {
                op--;
            } else {
                cl++;
            }
        }
        return op + cl;
    }
}
