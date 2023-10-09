import java.io.*;
import java.util.*;

class Main{
    public static int n, temp;
    public static String[] str;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Deque<Integer> num = new ArrayDeque<>();
        Deque<Integer> bal = new ArrayDeque<>();

        for(int i = 2; i <= n; i++){
            num.offerLast(i);
        }

        str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++){
            bal.offerLast(Integer.parseInt(str[i]));
        }

        sb.append(1).append(" ");
        temp = bal.pollFirst();

        while(!num.isEmpty()){
            if(temp > 0){
                for(int i = 0; i < temp-1; i++){
                    num.offerLast(num.pollFirst());
                    bal.offerLast(bal.pollFirst());
                }
                sb.append(num.pollFirst()).append(" ");
                temp = bal.pollFirst();
            } else {
                temp = Math.abs(temp) - 1;
                for(int i = 0; i < temp; i++){
                    num.offerFirst(num.pollLast());
                    bal.offerFirst(bal.pollLast());
                }
                sb.append(num.pollLast()).append(" ");
                temp = bal.pollLast();
            }
        }

        System.out.println(sb.toString());

    }
}