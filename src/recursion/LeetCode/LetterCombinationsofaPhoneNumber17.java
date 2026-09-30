package recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {

    static void solve(String digits, int index, String[] mapping,
                      List<String> ans,StringBuilder output){

        if(index >= digits.length()){
            ans.add(output.toString());
            return;
        }

        int value = digits.charAt(index) - '0';
        String mapString = mapping[value];

        for (int i = 0; i < mapString.length(); i++){
            output.append(mapString.charAt(i));
            solve(digits, index + 1, mapping, ans, output);

            output.deleteCharAt(output.length() - 1);
        }
    }
    public static List<String> letterCombinations(String digits) {
        String[] mapping  = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index = 0;
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        solve(digits, index, mapping, ans, output);

        return ans;
    }
    public static void main(String[] args) {

        String digits = "234";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }
}
