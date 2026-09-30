package LeetCode;

public class StringCompression443 {
    public static int compress(char[] chars) {

        int readIndex = 0;
        int writeIndex = 0;
        int n = chars.length;

        while(readIndex < n){

            char ch = chars[readIndex];
            int count = 0;

            while (readIndex < n && chars[readIndex] == ch){

                readIndex ++;
                count ++;
            }

            chars[writeIndex ++ ] = ch;

            if(count > 1){

                String digits = String.valueOf(count);

                for (char digit : digits.toCharArray()){

                    chars[writeIndex ++] = digit;
                }
            }

        }
        return  writeIndex;
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c','c','c','c','c','c','c','c','c','c'};
        int ans = compress(chars);
        System.out.println("ans = "+ans);
    }
}
