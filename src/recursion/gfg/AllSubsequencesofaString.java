package recursion.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubsequencesofaString {
    static void getAllSubsequence(String s,int index,StringBuilder output,List<String> ans){
        if(index >= s.length()){
            ans.add(output.toString());
            return;
        }
        // include

        char ch = s.charAt(index);
        output.append(ch);
        getAllSubsequence(s,index+1,output,ans);

        // exclude
        output.deleteCharAt(output.length() - 1);
        getAllSubsequence(s,index+1,output,ans);

    }
    public static void main(String[] args) {
        String s = "aa";
        int index = 0;
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        getAllSubsequence(s,index,output,ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
