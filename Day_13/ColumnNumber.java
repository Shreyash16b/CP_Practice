package CP_Practice.Day_13;

public class ColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            System.out.println(columnTitle.charAt(i) - '0' - 16 + " " + (Math.pow(26, columnTitle.length() - 1 - i)));
            ans += (columnTitle.charAt(i) - '0' - 16) * (Math.pow(26, columnTitle.length() - 1 - i));
        }
        // System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        titleToNumber("ZY");
    }
}
