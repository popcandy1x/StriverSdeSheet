import java.util.* ;
import java.io.*; 
public class majorityelement{
	public static int findMajority(int[] arr, int n) {
		int[] b=new int[(int)(Math.pow(10,6))];
        for(int i=0;i<arr.length;i++){
            b[Math.abs(arr[i])]++;
            if(b[Math.abs(arr[i])]>Math.floor(arr.length/2)){
                return arr[i];
            }
        }
        return -1;
	}
}