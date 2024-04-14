package CP_Practice.March_19;
 
public class DiceRolls {
    public int numRollsToTarget(int n, int k, int target) {
        int mod = (int) ((Math.pow(10, 9))+7);
        int[] dp = new int[target+1];
        dp[0] = 1;

        for(int i=0; i<n; i++){
            int[] new_dp = new int[target+1];

            for(int j=1; j<k+1; j++){
                for(int m=j; m<target+1; m++){
                    new_dp[m] = (dp[m] + dp[m-j]) % mod;
                }
            }
            dp = new_dp;
        }
        return 0;
    }
}
