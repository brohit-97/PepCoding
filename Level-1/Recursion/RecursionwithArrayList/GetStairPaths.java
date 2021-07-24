import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));

    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0){
             ArrayList<String> bcond = new ArrayList<String>();
             bcond.add("");
             return bcond;
        }
        if(n < 0){
           ArrayList<String> bcond = new ArrayList<String>();
             return bcond; 
        }
        
        ArrayList<String> n1 = getStairPaths(n-1);
         ArrayList<String> n2 = getStairPaths(n-2);
          ArrayList<String> n3 = getStairPaths(n-3);
         
        ArrayList<String> paths = new ArrayList<String>();    
        for(String step : n1)
            paths.add("1"+ step);
        for(String step : n2)
            paths.add("2"+ step);
        for(String step : n3)
            paths.add("3"+ step);
            
    return paths;
    }

}
