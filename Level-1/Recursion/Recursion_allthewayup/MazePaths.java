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
	        
	        if(sc< dc)
	        printMazePaths(sr, sc+1, dr, dc, path+"h");
	        if(sr < dr)
	        printMazePaths(sr+1, sc, dr, dc, path+"v");
	    }
        
    
	}
