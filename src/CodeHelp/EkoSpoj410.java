package CodeHelp;

public class EkoSpoj410 {

    static boolean isValid(int trees[],int mid,int m){

        int sum = 0;
        for(int ele : trees){
            if(mid < ele){
                int val = ele - mid;
                sum += val;
            }
        }
        if (sum >= m){
            return true;
        } else {
            return false;
        }
    }
    static int ekoSpoj(int[] trees, int m){
        int left =0;
        int right = 0;
        int ans = -1;
        for (int ele : trees){
            right = Math.max(ele,right);
        }

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (isValid(trees,mid,m)){
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []trees = {20,15,10,17};
        int m = 7;
        int ans = ekoSpoj(trees,m);
        System.out.println("ans = "+ans);
    }
}
