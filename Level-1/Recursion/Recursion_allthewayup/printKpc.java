import java.io.*;
import java.util.*;

public class Main {

      public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        printKPC(str, "");
    }
    static String[] keys={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return ;
        }
        char s = str.charAt(0);
        String sub = str.substring(1);
        
        String key=keys[s - '0'];
        
        for(int i=0 ; i < key.length();i++){
        printKPC(sub, asf + key.charAt(i) );
        }
    }

}
