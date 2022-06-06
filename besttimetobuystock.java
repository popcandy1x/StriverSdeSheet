import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class besttimetobuystock{
    public static int maximumProfit(ArrayList<Integer> prices){
        int maxProfit=0;
        int minStock=prices.get(0);
        for(int i=1;i<prices.size();i++){
            if(prices.get(i)<minStock){
                minStock=prices.get(i);
            }
            else{
                maxProfit=Math.max(maxProfit,prices.get(i)-minStock);
            }
        }
        return maxProfit;
    }
}