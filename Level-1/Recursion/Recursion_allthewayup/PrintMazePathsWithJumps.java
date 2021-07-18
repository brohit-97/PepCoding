import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1,1,n,m,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
     
             if(sc == dc && sr == dr){
	            System.out.println(path);
	            return;
        	}
        	for(int i=1 ; i <= dc-sc; i++)
	            printMazePaths(sr, sc+i, dr, dc, path+"h"+i);
	        for(int i=1 ; i <= dr-sr; i++)
	             printMazePaths(sr+i, sc, dr, dc, path+"v"+i);
	        for(int i=1 ; i <= dr-sr && i <= dc-sc; i++)
	             printMazePaths(sr+i, sc+i, dr, dc, path+"d"+i);
	  
	     return;
	    }   

}
