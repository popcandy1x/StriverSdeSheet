import java.util.ArrayList;

public class missingandrepeatingnumbers{

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
       int[] missingRepeating=new int[2];
       int[] b=new int[arr.size()+1];
       for(int i=0;i<arr.size();i++){
           b[arr.get(i)]++;
       }
       for(int i=1;i<b.length;i++){
           if(b[i]>1){
               missingRepeating[1]=i;
           }
           if(b[i]==0){
               missingRepeating[0]=i;
           }
       }
       return missingRepeating;
    }
}