import java.util.Scanner;

public class TableOf1To10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting term: ");
        int start=sc.nextInt();
        System.out.print("Enter ending term: ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println();
        }
        sc.close();
    }
}
