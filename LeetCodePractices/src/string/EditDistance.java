package string;

public class EditDistance {
	public static void main(String[] args) {
		String word1 = "horse", word2 = "ros";
		int m = word1.length();
        int n = word2.length();

        // Create DP table
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;  // delete all characters from word1
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;  // insert all characters to word1
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];  // no operation needed
                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j],    // delete
                        Math.min(
                            dp[i][j - 1],    // insert
                            dp[i - 1][j - 1] // replace
                        )
                    );
                }
            }
        }
		
		System.out.println(dp[m][n]);
	}

}
