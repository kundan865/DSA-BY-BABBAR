package basicQuestion;

public class findAverageOfArrayElements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }

        double avg = (double) sum / arr.length;

        System.out.println("avearage "+avg);
    }
}
