import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            else if(arr[i]==1){
                countOne++;
            }
            else{
                countTwo++;
            }
        }
        int k=0;
        while(countZero-->0){
            arr[k]=0;
            k++;
        }
        while(countOne-->0){
            arr[k]=1;
            k++;
        }
        while(countTwo-->0){
            arr[k]=2;
            k++;
        }
        
    }
}