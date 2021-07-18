import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String path) {
        
        if(str.length()==0)
        {
            System.out.println(path);
            return;
        }
        
        for(int i = 0; i < str.length(); i++){
            printPermutations(str.substring(0,i)+str.substring(i+1), path + str.charAt(i));
        }
        
        return;
    }

}
