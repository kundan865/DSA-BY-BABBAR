package gfg;

public class MostFrequentCharacter {
    public static char getMaxOccuringChar(String s) {

        int[] alphabet = new int[26];
        char ans = ' ';
        int occuring = -1;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int position = ch - 'a';
            alphabet[position]++;
        }
        for(int i = 0; i < 26; i++){

            if(alphabet[i] > occuring){
                occuring = alphabet[i];
                char ch = (char) ('a'+i);
                ans = ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "testsample";
        char ans = getMaxOccuringChar(s);

        System.out.println("ans = "+ans);
    }
}
