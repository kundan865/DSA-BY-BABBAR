package basicQuestion;

public class findThefirstUnsortedArray {

    static int getUnsortedElement(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,3};
        int ans = getUnsortedElement(arr);
        System.out.println("ans = " + ans);
    }

}
