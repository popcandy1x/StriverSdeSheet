import java.util.* ;
import java.io.*; 
public class Solution {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
        Set<ArrayList<Integer>> D=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;
            int k1=K-arr[i];
            while(j<k){
                if(arr[j]+arr[k]<k1){
                    j++;
                }
                else if(arr[j]+arr[k]>k1){
                    k--;
                }
                else{
                    ArrayList<Integer> e=new ArrayList<Integer>();
                    e.add(arr[i]);
                    e.add(arr[j]);
                    e.add(arr[k]);
                    D.add(e);
                    j++;
                    k--;
                }
            }
        }
        ArrayList<ArrayList<Integer>> d=new ArrayList<>(D);
        return d;
    }
}