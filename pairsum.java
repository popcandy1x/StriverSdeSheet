import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        List<List<Integer>> d=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    List<Integer> e=new ArrayList<>();
                    e.add(arr[i]);
                    e.add(arr[j]);
                    d.add(e);
                }
            }
        }
        int[][] a=new int[d.size()][d.get(0).size()];
        for(int l=0;l<d.size();l++){
            for(int k=0;k<d.get(0).size();k++){
                a[l][k]=d.get(l).get(k);
            }
        }
        return a;
    }
}