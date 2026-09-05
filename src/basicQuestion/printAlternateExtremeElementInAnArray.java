package basicQuestion;

public class printAlternateExtremeElementInAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int st = 0;
        int end = arr.length - 1;
        int [] ans = new int[arr.length];
        int index = 0;
        while(st < end) {
            ans[index++] = arr[st++];
            ans[index++] = arr[end--];
        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
