//This program is for minimum absolute sum of all given number;

import java.util.*;

public class MinAbsSum {

    public static void main(String[] args) {
        int A[] = {1,4,2,5};
        int B[] = {3,1,2,4};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Mimimum difference of given number is "+minDiff);
    }
}
