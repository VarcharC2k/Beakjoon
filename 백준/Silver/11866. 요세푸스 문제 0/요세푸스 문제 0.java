import java.io.*;
import java.util.*;

class Main{
    public static int n,k;
    public static String[] str;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);
        Queue<Integer> arr = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            arr.offer(i);
        }

        sb.append("<");
        while(arr.size() != 1){
            for(int i = 0; i < k-1; i++){
                arr.offer(arr.poll());
            }
            sb.append(arr.poll()).append(", ");
        }

        sb.append(arr.poll()).append(">");
        System.out.println(sb.toString());
    }
}