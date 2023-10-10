import java.io.*;
import java.util.*;

class Main{
    public static int n,m,cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        Set<String> hs = new HashSet<>();
        String[] arr1 = br.readLine().split(" ");
        for(int i = 0; i < arr1.length; i++){
            hs.add(arr1[i]);
        }
        
        String[] arr2 = br.readLine().split(" ");
        for(int i = 0; i < arr2.length; i++){
            hs.add(arr2[i]);
        }
        
        cnt = arr1.length + arr2.length - hs.size();
        System.out.println((arr1.length - cnt) + (arr2.length - cnt));

    }
}