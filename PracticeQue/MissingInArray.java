public class MissingInArray{
    public static int missing(int[] arr,int x){
        int totalSum = (x*(x+1)/2);
        int arraySum = 0;
        for(int i=0;i<arr.length;i++){
            arraySum += arr[i]; 
        }
        return totalSum - arraySum;
    }
    public static void main(String[] args) {
        int x=5;
        int[] arr = {1,2,3,4};
        System.out.println(missing(arr,x));
    }
}