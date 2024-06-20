import java.util.*;
import java.io.*;

class Main{
    public static String s;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        char a;
        char b;
        int result = 1;
        for(int i = 0; i < s.length(); i++){
            a = s.charAt(i);
            b = s.charAt(s.length()-1-i);
            if(a!=b){
                result = 0;
                break;
            }
        }
        System.out.println(result);
        
        
    }
}