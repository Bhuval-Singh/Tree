public class HollowPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=2*i-1;j++){
                if((j==1) ||(j==2*i-1)){
                    System.out.print("*");
                } else if(i==5){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}