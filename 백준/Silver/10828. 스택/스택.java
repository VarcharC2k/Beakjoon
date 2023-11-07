import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static String s;
    public static String[] str;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        Stack<Integer> arr = new Stack<>();
        sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            try {
                switch (str[0]) {
                    case "push":
                        arr.push(Integer.parseInt(str[1]));
                        break;
                    case "pop":
                        sb.append(arr.pop()).append("\n");
                        break;
                    case "size":
                        sb.append(arr.size()).append("\n");
                        break;
                    case "empty":
                        if (arr.isEmpty()) {
                            sb.append(1).append("\n");
                        } else {
                            sb.append(0).append("\n");
                        }
                        break;
                    case "top":
                        sb.append(arr.peek()).append("\n");
                        break;
                }
            } catch (Exception e) {
                sb.append(-1).append("\n");
            }
        }
        System.out.println(sb);
    }
}