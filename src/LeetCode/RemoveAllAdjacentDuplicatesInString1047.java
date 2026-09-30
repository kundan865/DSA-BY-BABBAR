package LeetCode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public static String removeDuplicates1(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);
            int size = ans.length();

            if (size > 0 && ans.charAt(size - 1) == ch){
                ans.deleteCharAt(size - 1);
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){

            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "abbaca";
        String ans = removeDuplicates1(s);
        System.out.println("ans = "+ans);
    }
}
