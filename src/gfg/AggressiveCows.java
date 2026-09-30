package gfg;

import java.util.Arrays;

public class AggressiveCows {

    static boolean isPossible(int[] stalls, int mid, int k){
        int cows = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            if(stalls[i] - lastPosition >= mid){
                cows ++;
                lastPosition = stalls[i];
            }
            if(cows >=k ){
                return true;
            }
        }
        return false;
    }

    static int aggressive(int []stalls,int k){
        Arrays.sort(stalls);
        int n = stalls.length;
        int left = 0;
        int right = stalls[n - 1] - stalls[0];
        int ans = -1;
        System.out.println("left = "+left+" right = "+right+" mid = ");

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(isPossible(stalls,mid,k)) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
            System.out.println("left = "+left+" right = "+right+" mid = "+mid);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 8, 9};
        int k = 2;
        int ans = aggressive(arr,k);
        System.out.println("ans = "+ans);
    }
}
