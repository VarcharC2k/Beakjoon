import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Stack<Integer> arr = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            str = br.readLine().split("");
            for(int j = 0; j < str.length; j++){
                if(str[j].equals("(")){
                    arr.push(1);
                } else{
                    if(arr.isEmpty()){
                        arr.push(1);
                        break;
                    }
                    arr.pop();
                }
            }

            if(arr.isEmpty()){
                sb.append("YES").append("\n");
            } else{
                sb.append("NO").append("\n");
            }

            arr.clear();
        }

        System.out.println(sb.toString());
    }
}