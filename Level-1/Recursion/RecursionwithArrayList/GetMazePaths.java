import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(0, 0, n-1, m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bcond = new ArrayList<String>();
            bcond.add("");
            return bcond;
        }
        ArrayList<String> hpaths = new ArrayList<String>();
        if(sc < dc)
            hpaths=getMazePaths(sr, sc + 1, dr, dc);
            
        ArrayList<String> vpaths = new ArrayList<String>();
        if(sr < dr)
            vpaths=getMazePaths(sr + 1, sc , dr, dc);
         
        ArrayList<String> paths = new ArrayList<String>();    
        for(String hpath : hpaths)
            paths.add("h"+hpath);
        for(String vpath : vpaths)
            paths.add("v"+vpath);   
        
    return paths;
    }

}
