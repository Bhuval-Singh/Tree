import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number those number you want fabonacci series");
        int first=sc.nextInt();
        int second=sc.nextInt();
        System.out.print("Enter how many term you want to print fabonacci series: ");
        int term=sc.nextInt();
        for(int i=0;i<term;i++){
            int third=first + second;
            System.out.println(third);
            first=second;
            second=third;
        }
        sc.close();
    }
}
