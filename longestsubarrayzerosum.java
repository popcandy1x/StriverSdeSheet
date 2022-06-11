import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class longestsubarrayzerosum {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int sum=0;
        int maxSubArrayLength=0;
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,0);
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(prefixSum.containsKey(sum)){
                maxSubArrayLength=Math.max(maxSubArrayLength,i+1-prefixSum.get(sum));
            }
            else
            prefixSum.put(sum,i+1);
        }
        
        return maxSubArrayLength;
    }
}