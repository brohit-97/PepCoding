import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   System.out.println(fibodp(n, new int[n+1]));
 }

 public static int fibodp(int n , int[] memo){
    if(n == 1 || n == 0)
     return n;
    if(n < 0)
     return 0;
    if(memo[n] != 0){
        return memo[n];
    } 
    
    int result = fibodp(n-1, memo)+fibodp(n-2, memo); 
    memo[n] = result;
    return result;
 }

}
