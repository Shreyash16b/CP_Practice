package CP_Practice.Day_9;

public class IntegerToRoman {

    public static String solve(int num) {
        StringBuilder res = new StringBuilder();

        while (num > 0) {
            if (num / 1000 >= 1) {
                int x = num / 1000;
                for (int i = 0; i < x; i++) {
                    res.append("M");
                }
                num %= 1000;
            } else if (num / 900 >= 1) {
                int x = num / 900;
                for (int i = 0; i < x; i++) {
                    res.append("CM");
                }
                num %= 900;
            } else if (num / 500 >= 1) {
                int x = num / 500;
                for (int i = 0; i < x; i++) {
                    res.append("D");
                }
                num %= 500;
            } else if (num / 400 >= 1) {
                int x = num / 400;
                for (int i = 0; i < x; i++) {
                    res.append("CD");
                }
                num %= 400;
            } else if (num / 100 >= 1) {
                int x = num / 100;
                for (int i = 0; i < x; i++) {
                    res.append("C");
                }
                num %= 100;
            } else if (num / 90 >= 1) {
                int x = num / 90;
                for (int i = 0; i < x; i++) {
                    res.append("XC");
                }
                num %= 90;
            } else if (num / 50 >= 1) {
                int x = num / 50;
                for (int i = 0; i < x; i++) {
                    res.append("L");
                }
                num %= 50;
            } else if (num / 40 >= 1) {
                int x = num / 40;
                for (int i = 0; i < x; i++) {
                    res.append("XL");
                }
                num %= 40;
            } else if (num / 10 >= 1) {
                int x = num / 10;
                for (int i = 0; i < x; i++) {
                    res.append("X");
                }
                num %= 10;
            } else if (num / 9 >= 1) {
                int x = num / 9;
                for (int i = 0; i < x; i++) {
                    res.append("IX");
                }
                num %= 9;
            } else if (num / 5 >= 1) {
                int x = num / 5;
                for (int i = 0; i < x; i++) {
                    res.append("V");
                }
                num %= 5;
            } else if (num / 4 >= 1) {
                int x = num / 4;
                for (int i = 0; i < x; i++) {
                    res.append("IV");
                }
                num %= 4;
            } else {
                int x = num / 1;
                for (int i = 0; i < x; i++) {
                    res.append("I");
                }
                break;
            }
        }
        String ans = String.valueOf(res);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        solve(1991);
    }

}
