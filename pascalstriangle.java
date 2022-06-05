import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class pascalstriangle{
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> b=new ArrayList<>();
         long[][] a=new long[n+1][n+1];
         a[0][1]=1;
         for(int i=1;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(i>=j){
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
         }
         for(int i=1;i<a.length;i++){
            ArrayList<Long> d=new ArrayList<>();
            for(int j=1;j<a.length;j++){
               if(i>=j){
                d.add(a[i][j]);
               }
            }
            b.add(d);
         }
         return b;
    }
}
