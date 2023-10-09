import java.io.*;
import java.util.*;

class Main{
    public static int n,temp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Queue<Integer> arr = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            arr.offer(i);
        }

        while(arr.size() != 1){
            arr.poll();
            temp = arr.poll();
            arr.offer(temp);
        }

        System.out.println(arr.poll());
    }
}