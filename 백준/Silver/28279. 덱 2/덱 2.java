import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> arr = new LinkedList<>();


        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            switch(Integer.parseInt(st.nextToken())){
                case 1 :
                    arr.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    arr.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3 :
                    if (arr.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr.pollFirst()).append("\n");
                    }
                    break;
                case 4 :
                    if (arr.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr.pollLast()).append("\n");
                    }
                    break;
                case 5 :
                    sb.append(arr.size()).append("\n");
                    break;
                case 6 :
                    if (arr.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 7 :
                    if (arr.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr.peekFirst()).append("\n");
                    }
                    break;
                case 8 :
                    if (arr.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr.peekLast()).append("\n");
                    }
                    break;

            }
        }
            System.out.println(sb.toString());
    }
}