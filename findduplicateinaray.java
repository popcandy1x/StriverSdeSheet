import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class findduplicateinaray{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int[] b=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            b[arr.get(i)]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>1){
                return i;
            }
        }
        return -1;
    }
}
