import java.util.*;
import java.io.*;

class Main{
    public static String s;
    public static int cnt;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        while((s=br.readLine()) != null && !s.isEmpty()){
            arr.add(Integer.parseInt(s) % 42);
        }
        br.close();
        
        for(int i : arr){
            if(!result.contains(i)){
                result.add(i);
            }
        }
        
        System.out.println(result.size());
    }
}