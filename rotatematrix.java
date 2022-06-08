import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class rotatematrix{
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int[][] a=new int[mat.size()][mat.get(0).size()];
        int[][] b=new int[mat.size()][mat.get(0).size()];
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.get(0).size();j++){
                a[i][j]=mat.get(i).get(j);
            }
        }
       int rows=a.length;
        int columuns=a[0].length;
        int s=-1;
        int k=1;
        int l=0;
        while(l<rows&&k<columuns){
         if(rows-l<=1){
             break;
         }
         while(k<columuns){
            b[l][k]=a[l][k-1];
            k++;
        }
        k--;
        l++;
        while(l<rows){
            b[l][k]=a[l-1][k];
            l++;
        }
        l--;
        k--;
        while(k>s){
            b[l][k]=a[l][k+1];
            k--;
        }
        k++;
        l--;
        while(l>s){
            b[l][k]=a[l+1][k];
            l--;
        }   
        l++;
        rows--;
        columuns--;
        s++;
        l=s+1;
        k=s+2;
        }
         if(rows-l<=1){
             for(int i=l;i<rows;i++){
                 for(int j=l;j<columuns;j++){
                     b[i][j]=a[i][j];
                 }
             }
         }
        if(k==columuns){
            for(int i=l;i<rows;i++){
                for(int j=l;j<columuns;j++){
                    b[i][j]=a[i][j];
                }
            }
        }
         for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.get(0).size();j++){
               if(a.length==1)
                   mat.get(i).set(j,a[i][j]);
               else
                   mat.get(i).set(j,b[i][j]);
            }
        }
    }
}
