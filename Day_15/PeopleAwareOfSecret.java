package CP_Practice.Day_15;

public class PeopleAwareOfSecret {
    public static int peopleAwareOfSecret(int n, int delay, int forget) {
        int res = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        int PeopleSharing = 0;
        int newPeople = 0;
        int forgetPeople = 0;
        for (int i = delay; i < n; i++) {
            newPeople = dp[i - delay];
            if (i >= forget)
                forgetPeople = dp[i - forget];
            PeopleSharing += newPeople - forgetPeople;
            dp[i] = PeopleSharing;
        }
        for (int i = n - forget; i < n; i++) {
            res += dp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(peopleAwareOfSecret(6, 2, 4));
    }
}
