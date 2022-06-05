import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class nextpermutation{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int checkIfOneLesserFromBackPresent=0;
        int lesserIndex=0;
        for(int i=permutation.size()-2;i>-1;i--){
            if(permutation.get(i)<permutation.get(i+1)){
                checkIfOneLesserFromBackPresent=1;
                lesserIndex=i;
                break;
            }
        }
        if(checkIfOneLesserFromBackPresent==0){
            for(int i=0;i<permutation.size()/2;i++){
                int t=permutation.get(i);
                permutation.set(i,permutation.get(permutation.size()-1-i));
                permutation.set(permutation.size()-1-i,t);
            }
            return permutation;
        }
        for(int i=permutation.size()-1;i>-1;i--){
            if(permutation.get(i)>permutation.get(lesserIndex)){
                int t=permutation.get(i);
                permutation.set(i,permutation.get(lesserIndex));
                permutation.set(lesserIndex,t);
                break;
            }
        }
        int j=permutation.size()-1;
        int i=lesserIndex+1;
        while(i<j){
            int t=permutation.get(i);
            permutation.set(i,permutation.get(j));
            permutation.set(j,t);
            i++;
            j--;
        }
        return permutation;
    }
}
