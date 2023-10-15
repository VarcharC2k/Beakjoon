import java.io.*;
import java.util.*;

class Main{
    public static String[] str;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        List<Integer> arr = new ArrayList<>();
        
        for(String s : str){
            arr.add(Integer.parseInt(s));
        }
        Collections.sort(arr);
        System.out.println(arr.get(1));
    }
}