
//Program for find the minimum price of chocolate piece
import java.util.*;

public class ChocolatePieces {
    public static void main(String[] args) {
        Integer costVer[] = { 6, 1, 3, 1, 4 };//column = 6
        Integer costHor[] = { 4, 1, 2 }; //row = 4
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else{
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost of total pieces is "+cost);
    }
}
