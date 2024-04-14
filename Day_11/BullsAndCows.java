package CP_Practice.Day_11;

public class BullsAndCows {

    public static void main(String[] args) {
        String a = "1123";
        String b = "0111";
        System.out.println(getHint(a, b));
    }

    public static String getHint(String secret, String guess) {
        int x = 0, y = 0;
        int[] num = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) {
                y++;
            } else {
                if (num[s]++ < 0) { // <0 means already visited by guess
                    x++;
                }
                if (num[g]-- > 0) { // >0 means already visited by secret
                    x++;
                }
            }
        }
        String res = y + "A" + x + "B";
        return res;
    }
}
