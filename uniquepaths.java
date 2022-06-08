import java.util.* ;
import java.io.*; 
public class uniquepaths{
	public static int uniquePaths(int m, int n) {
        int[][] a=new int[m][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=-1;
            }
        }
		int uniquepths=uniquePaths(0,0,m,n,a);
        return uniquepths;
	}
    public static int uniquePaths(int p,int q,int m,int n,int[][] a){
        if(p==m-1&&q==n-1){
            return 1;
        }
        else if(p>=m){
            return 0;
        }
        else if(q>=n){
            return 0;
        }
        if(a[p][q]!=-1){
            return a[p][q];
        }
        else{
            a[p][q]=uniquePaths(p,q+1,m,n,a)+uniquePaths(p+1,q,m,n,a);
            return a[p][q];
        }
    }
}