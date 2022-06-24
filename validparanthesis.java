import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String expression) {
       Stack<Character> a=new Stack<>();
       for(int i=0;i<expression.length();i++){
         if(expression.charAt(i)=='{'||expression.charAt(i)=='['||expression.charAt(i)=='(' ){
            a.push(expression.charAt(i));
         }
         else if(!a.isEmpty()){
            boolean b=bracketalityChecker(a.peek(),expression.charAt(i));
            if(b){
               a.pop();
            }
            else{
               return false;
            }
         }
         else{
            return false;
         }
       }
       return a.size()==0;
    }
    public static boolean bracketalityChecker(char a,char b){
      if(a=='{'&&b=='}'){
         return true;
      }
      else if(a=='['&&b==']'){
         return true;
      }
      else if(a=='('&&b==')'){
         return true;
      }
      else{
         return false;
      }
    }
}