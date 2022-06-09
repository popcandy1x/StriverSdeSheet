import java.util.* ;
import java.io.*; 
public class longestconsecutivesequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        if(arr.length==0){
            return 0;
        }
        Set<Integer> s=new HashSet<>();
        int count=0;
        int maxConsecutiveLength=0;
        for(int i=0;i<arr.length;i++){
           s.add(arr[i]);
        }
        for(int i:s){
            if(!s.contains(i-1)){
                int j=i+1;
                while(s.contains(j)){
                    count++;
                    i++;;
                    j=i+1;
                }             
                maxConsecutiveLength=Math.max(count,maxConsecutiveLength);
                count=0;
            }
        }
        return maxConsecutiveLength+1;
    }
}