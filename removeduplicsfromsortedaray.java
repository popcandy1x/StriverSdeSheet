import java.util.*;
import java.io.*;

public class removesduplicsfromsortedaray{
     public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        for(int i=arr.size()-1;i>0;i--){
            if(arr.get(i)==arr.get(i-1)){
                arr.remove(i);
            }
        }
        return arr.size();
    }
}