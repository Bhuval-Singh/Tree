import java.util.Scanner;

public class VotingBySwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        switch (age) {
            case (16):
                System.out.println("You are under age");
                break;
            case (18):
                System.out.println("You are elligible for voting");
                break;
            case 65:
                System.out.println("You are senior citizen");
                break;
            default:
                System.out.println("You are not illigible for voting");
                break;
        }
        sc.close();
    }
}
