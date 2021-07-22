import java.io.*;
import java.util.*;

public class Main {

 public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
            }
       
       char first=str.charAt(0);
       ArrayList<String> subs = gss(str.substring(1));
       
       ArrayList<String> fsubs = new ArrayList<String>();
       for(String st:subs)
            fsubs.add(st);
       for(String st:subs)
            fsubs.add(first+st);
        return fsubs;
    }

}
