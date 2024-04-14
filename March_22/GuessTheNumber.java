package CP_Practice.March_22;

public class GuessTheNumber {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+2][n+2];
        for (int i = n; i >= 1; i--) {
            for(int j=i; j<=n; j++){
                if(i==j){
                    continue;
                }
                else{
                    int m= Integer.MAX_VALUE;
                    for(int k=i; k<=j; k++){
                        m = Math.min(m, i+Math.max(dp[i][k-1], dp[k+1][j]));
                    }
                    dp[i][j] = m;
                }
            }
        }
        return dp[1][n];
    }
}
