package gfg;
public class BookAllocation{
    static boolean isPossibble(int[] nums,int mid,int k){
        int maxPages = mid;
        int pages = 0;
        int student = 1;

        for(int ele : nums){
            if(ele > maxPages){
                return false;
            }
            if(pages + ele <= maxPages){
                pages += ele;
            }else {
                student ++;

                if(k < student){
                    return false;
                }
                pages = ele;
            }
        }
        return true;
    }
    static int allocate(int[] nums,int k){
        int left = 0;
        int right = 0;
        int ans = -1;

        for(int ele : nums){
            left = Math.max(ele,left);
            right += ele;
        }
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(isPossibble(nums,mid,k)){
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {12,34,67,90};
        int  k = 2;
        int ans = allocate(nums,k);
        System.out.println("ans = "+ans);
    }
}