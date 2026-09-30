package LeetCode;

import java.util.Arrays;

public class PermutationinString567 {
    public static boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        int[] s1Array = new int[26];
        int[] windows = new int[26];

        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            int index = ch - 'a';
            s1Array[index]++;
        }

        int windowSize = s1.length();


        for(int i = 0; i < windowSize; i++){
            char ch = s2.charAt(i);
            int index = ch - 'a';
            windows[index]++;
        }

        if(Arrays.equals(s1Array,windows)){
            return true;
        }

        for (int i = windowSize; i < s2.length(); i++){

            char ch = s2.charAt(i);
            int index = ch - 'a';
            windows[index]++;

            char leftChar = s2.charAt(i - windowSize);
            int leftIndex = leftChar - 'a';
            windows[leftIndex]--;


            if (Arrays.equals(s1Array,windows)){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        String  s1 = "ab", s2 = "eidbaooo";
//        String s1 = "ab", s2 = "eidboaoo";
        boolean ans = checkInclusion(s1,s2);
        System.out.println("ans = "+ans);
    }
}
