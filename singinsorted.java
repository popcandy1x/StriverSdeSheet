import java.util.*;

public class Solution 
{
    public static int uniqueElement(ArrayList<Integer> arr) 
    {
        int[] b=new int[arr.size()];
        for(int i=0;i<b.length;i++){
            b[i]=arr.get(i);
        }
        for(int i=0;i<b.length;i+=2){
            if(i==b.length-1){
                return b[i];
            }
            if(b[i]!=b[i+1]){
                return b[i];
            }
        }
        return -1;
    }
}