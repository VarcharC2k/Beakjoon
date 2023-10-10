import java.io.*;
import java.net.InetSocketAddress;
import java.util.*;

class Main{
    public static int n,m;
    public static String[] str;
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        HashMap<Integer, String> arr = new HashMap<>();
        HashMap<String, Integer> arr2 = new HashMap<>();

        for(int i = 1; i <= n; i++){
            s = br.readLine();
            arr.put(i,s);
            arr2.put(s, i);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < m; i++){
            s = br.readLine();
            if (s.matches("^-?\\d+$")) {
                sb.append(arr.get(Integer.parseInt(s))).append("\n");
            } else {
                sb.append(arr2.get(s)).append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}