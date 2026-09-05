package basicQuestion;

public class findElementInAnArray {

    static int search(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 50;

        int ans = search(arr,target);

        System.out.println("ans = "+ans);


    }
}
