import java.util.* ;
import java.io.*; 
public class countinversions {
    public static long getInversions(long arr[],int n) {
      return getinversions(arr);
    }
    public static long getinversions(long[] arr){
        if(arr.length<=1){
            return 0;
        }
       long[] b=new long[arr.length/2];
       long[] c=new long[arr.length-b.length];
       for(int i=0;i<b.length;i++){
        b[i]=arr[i];
       }
       for(int i=b.length;i<arr.length;i++){
        c[i-b.length]=arr[i];
       }
       long p=getinversions(b);
       long q=getinversions(c);
       long r=mergeInversionsCount(arr,b,c);
       return p+q+r;
    }
    public static long mergeInversionsCount(long[] arr,long[] a,long[] b){
        int p=0;
        int q=0;
        int k=0;
        long inversionCount=0;
        while(p<a.length&&q<b.length){
            if(a[p]>b[q]){
                arr[k]=b[q];
                k++;
                q++;
                inversionCount+=(a.length-p);
            }
            else{
                arr[k]=a[p];
                k++;
                p++;
            }
        }
        if(p<a.length){
            while(p<a.length){
                arr[k]=a[p];
                p++;
                k++;
            }
        }
        if(q<b.length){
            while(q<b.length){
                arr[k]=b[q];
                q++;
                k++;
            }
        }
        return inversionCount;
    }
}