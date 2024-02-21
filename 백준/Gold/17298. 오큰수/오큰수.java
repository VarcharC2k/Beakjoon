import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static int[] arr;
    public static String[] str;
    public static Stack<Integer> temp = new Stack<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        str = br.readLine().split(" ");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < n; i++) {
            if (temp.isEmpty()) {
                temp.push(i);
                continue;
            }

            while (!temp.isEmpty()) {
                if (arr[i] > arr[temp.peek()]) {
                        arr[temp.pop()] = arr[i];
                } else {
                    break;
                }
            }
            temp.push(i);
        }

        while (!temp.isEmpty()) {
            arr[temp.pop()] = -1;
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

}