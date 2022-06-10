import java.util.* ;
import java.io.*; 
public class longestsubnoreps
{
    public static int uniqueSubstrings(String input) 
    {
        Set<Character> s=new HashSet<>();
        int left=0;
        int right=0;
        int maxSubstringLength=0;
        while(right<input.length()){
            if(s.contains(input.charAt(right))){
                s.remove(input.charAt(left));
                left++;
            }
            else{
                s.add(input.charAt(right));
               maxSubstringLength=Math.max(maxSubstringLength,right-left+1);
                right++;
            }
        }
        return maxSubstringLength;
    }
}


