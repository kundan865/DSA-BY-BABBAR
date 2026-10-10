package Math;

public class Math {

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static int Mid(int left, int right){
        return left + (right - left) / 2;
    }
}
