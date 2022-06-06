import java.util.* ;
import java.io.*; 
public class mergetwosortedarays{
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
           Arrays.sort(arr1);
           Arrays.sort(arr2);
           int[] arr=new int[arr1.length+arr2.length];
           int p=0;
           int q=0;
           int k=0;
           while(p<arr1.length&&q<arr2.length){
               if(arr1[p]<arr2[q]){
                   arr[k]=arr1[p];
                   p++;
                   k++;
               }
               else{
                   arr[k]=arr2[q];
                   k++;
                   q++;
               }
           }
           if(p<arr1.length){
               while(p<arr1.length){
                   arr[k]=arr1[p];
                   k++;
                   p++;
               }
           }
           if(q<arr2.length){
               while(q<arr2.length){
                   arr[k]=arr2[q];
                   k++;
                   q++;
               }
           }
        int troublingZeroesInArr=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==0)
             troublingZeroesInArr++;
         }
         int[] arrans=new int[arr.length-troublingZeroesInArr];
         int f=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]!=0){
                 arrans[f]=arr[i];
                 f++;
             }
         }
         return arrans;
    }
}
