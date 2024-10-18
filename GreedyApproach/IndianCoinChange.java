/* This program calculates the minimum number of Indian coins/notes required to make a given amount. */
import java.util.*;

public class IndianCoinChange {
    public static void main(String[] args) {
        Integer coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 599;
        int count = 0;
        Arrays.sort(coin, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<coin.length;i++){
            if(coin[i] <= amount){
                while(coin[i] <= amount){
                    count++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }
        }
        System.out.println(count);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
