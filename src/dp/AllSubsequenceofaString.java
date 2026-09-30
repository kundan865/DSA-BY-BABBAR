package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubsequenceofaString {
    static List<String> getAllSubsequence(String s) {

        int n = s.length();

        List<String>[] dp = new ArrayList[n + 1];

        // Base case: empty string has one subsequence: ""
        dp[n] = new ArrayList<>();
        dp[n].add("");

        for (int i = n - 1; i >= 0; i--) {

            dp[i] = new ArrayList<>();

            // Exclude current character
            dp[i].addAll(dp[i + 1]);

            // Include current character
            char ch = s.charAt(i);

            for (String str : dp[i + 1]) {
                dp[i].add(ch + str);
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        String s = "abc";

        List<String> ans = getAllSubsequence(s);
        Collections.sort(ans);

        System.out.println(ans);
    }
}
