import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        } else if(num<0){
            System.out.println("Number is negetive");
        } else{
            System.out.println("Number is zero");
        }
        sc.close();
    }
}
