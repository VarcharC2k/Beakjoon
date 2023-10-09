import java.io.*;
import java.util.*;

class Main{
    public static int n,sum;
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        HashSet<String> arr = new HashSet<>();
        sum = 0;

        for(int i = 0; i < n; i++){
            s = br.readLine();
            if(s.equals("ENTER")){
                sum += arr.size();
                arr.clear();
            } else {
                arr.add(s);
            }
        }

        sum += arr.size();
        System.out.println(sum);
    }
}