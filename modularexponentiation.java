import java.util.* ;
import java.io.*; 
public class modularexponentiation{
    public static int modularExponentiation(int x, int n, int m) {
        long req=1;
        long x1=x;
        while(n>0){
            if(n%2!=0){
                req=((req)%m*(x1)%m)%m;
            }
            x1=((x1)%m*(x1)%m)%m;
            n=n>>1;
        }
        return (int)(req%m);
    }
}