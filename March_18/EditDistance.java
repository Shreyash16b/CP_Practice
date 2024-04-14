package CP_Practice.March_18;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word2.length()+1][word1.length()+1];

        for(int i=0 ; i<word1.length();i++){
            dp[word2.length()][i] = word1.length()-i;
        }
        for(int i=0 ; i<word2.length();i++){
            dp[i][word1.length()] = word2.length()-i;
        }

        for(int i=word2.length()-1; i>=0; i--){
            for( int j=word1.length()-1; j>=0; j--){
                if(word2.charAt(i) == word1.charAt(j)){
                    dp[i][j] = dp[i+1][j+1];
                }
                else{
                    // System.out.println(i+" "+j);
                    dp[i][j] = 1 + Math.min(dp[i+1][j], Math.min(dp[i][j+1], dp[i+1][j+1]));
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        EditDistance e = new EditDistance();
        System.out.println(e.minDistance("horse", "ros"));
    }
}
