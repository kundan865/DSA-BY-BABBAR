package recursion.gfg;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    static void solve(String s,String output,List<String> ans){

        if(s.isEmpty()){
            ans.add(output);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remString = s.substring(0, i) + s.substring(i + 1);
            solve(remString, output + ch, ans);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = new ArrayList<>();
        String output = "";
        solve(s,output,ans);
        System.out.println(ans);
    }
}
