import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        int[][] a=new int[m][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=mat.get(i).get(j);
            }
        }
        int rowGreaterCheckPlusIndex=-1;
        for(int i=0;i<a.length;i++){
            if(a[i][a[0].length-1]>=target){
                rowGreaterCheckPlusIndex=i;
                break;
            }
        }
        if(rowGreaterCheckPlusIndex==-1){
            return false;
        }
        else{
            int[] b=new int[a[0].length];
            for(int i=0;i<b.length;i++){
                b[i]=a[rowGreaterCheckPlusIndex][i];
            }
            if(binSearch(b,0,b.length-1,target)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    static boolean binSearch(int[] a,int p,int q,int target){
        if(p>q){
            return false;
        }
        int m=p+(q-p)/2;
        if(a[m]>target){
            return binSearch(a,p,m-1,target);
        }
        else if(a[m]<target){
            return binSearch(a,m+1,q,target);
        }
        else{
            return true;
        }
    }
}
