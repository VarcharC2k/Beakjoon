import java.io.*;
import java.util.*;

class Main{
    public static int n,cnt;
    public static String str;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            str = br.readLine();
            sb.append(pel(str,0,str.length()-1)).append(" ").append(cnt).append("\n");
            cnt = 0;
        }

        System.out.println(sb.toString());
    }

    public static int pel(String s, int a, int b){
        cnt++;
        if(a >= b){
            return 1;
        } else if (s.charAt(a) != s.charAt(b)){
            return 0;
        }

        return pel(s, a+1,b-1);
    }
}