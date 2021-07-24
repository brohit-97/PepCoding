import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getKPC(str));
    }

    static String[] keys={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
            }
        char first=str.charAt(0);
       ArrayList<String> subs = getKPC(str.substring(1));
       ArrayList<String> fsubs = new ArrayList<String>();
      // String f=keys[Integer.parseInt(first)].toString();
      String f=keys[first-'0'];
      for(int i=0;i<f.length();i++) 
       for(String st:subs)
            fsubs.add(f.charAt(i)+st);
    
    return fsubs;
    }

}
