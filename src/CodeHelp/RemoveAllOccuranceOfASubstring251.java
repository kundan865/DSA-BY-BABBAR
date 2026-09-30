package CodeHelp;

public class RemoveAllOccuranceOfASubstring251 {
    static String removeOccurences(String str, String part){

        while(str.contains(part)){

            int index = str.indexOf(part);

            String part1 =str.substring(0, index);
            String part2 = str.substring(index + part.length());

            str = part1 + part2 ;
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "ababcab";
        String part = "ab";
        String ans = removeOccurences(str,part);
        System.out.println("ans = "+ans);
    }
}
