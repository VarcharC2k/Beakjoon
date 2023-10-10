import java.io.*;
import java.util.*;

class Main{
    public static int n,m,result;
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        result = 0;

        HashMap<String, Boolean> arr = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr.put(br.readLine(), false);
        }

        for(int i = 0; i < m; i++){
            s = br.readLine();
            if(arr.containsKey(s)){
                result++;
            }
        }

        System.out.println(result);
    }
}