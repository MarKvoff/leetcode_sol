package leetcode_sol;

/**
 * This is the solution for problems in leetcode.com
 * Question 516. Longest Palindromic Subsequence
 * 
 * @author czm
 * 
 *
 */
public class Sol_516 {
	
	public int longestPalindromeSubseq(String s) {
		
		int[][] dp = new int[s.length()][s.length()];
        
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
            }
        }    
        
        return dp[0][s.length() - 1];
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
