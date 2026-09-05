package basicQuestion;

public class multiplyEachElementBy10 {
    static int[] multiplyBy10(int[]arr){
        int[]temp = new int[arr.length];

        for(int i = 0; i< arr.length;i++){
            temp[i] = arr[i] * 10;
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        int []ans = multiplyBy10(arr);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
