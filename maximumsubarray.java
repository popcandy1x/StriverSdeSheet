import java.util.* ;
import java.io.*; 

public class maximumsubarray{
	
	public static long maxSubarraySum(int[] arr, int n) {
    	    long[] b=new long[arr.length];
            b[0]=arr[0];
            long maxSubAraySum=b[0];
            for(int i=1;i<arr.length;i++){
                b[i]=arr[i]+b[i-1];
                if(b[i]<arr[i]){
                    b[i]=arr[i];
                }
                maxSubAraySum=Math.max(b[i],maxSubAraySum);
            }
            return maxSubAraySum<0?0:maxSubAraySum;
	}

}
