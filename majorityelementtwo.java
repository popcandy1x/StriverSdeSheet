import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class majorityelementtwo 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        ArrayList<Integer> d=new ArrayList<>();
        int[] b=new int[(int)(Math.pow(10,5)+1)];
        for(int i=0;i<arr.size();i++){
            b[arr.get(i)]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>Math.floor(arr.size()/3)){
                d.add(i);
            }
        }
        return d;
    }
}