package basicQuestion;

public class findUniqueElementInAnArray {
    static int findUnique(int []arr){
        int ans = 0;
        for(int ele : arr){
            ans = ans ^ ele;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,4,4,5,5};
        int ans = findUnique(arr);
        System.out.println("ans =  "+ans);
    }
}
