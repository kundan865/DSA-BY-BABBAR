package LeetCode;

public class ReverseWordsinaString151 {
    public static String reverseWords(String s) {

        String [] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){

            ans.append(words[i]);

            if(i!=0){
                ans.append(" ");
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
//        String str = "  hello world  ";
//        String str = "a good   example";

        System.out.println(str.length());
        String ans = reverseWords(str);
        System.out.println(ans.length());

        System.out.println("ans = "+ans);
    }
}
