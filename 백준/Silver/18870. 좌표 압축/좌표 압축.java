import java.io.*;
import java.util.*;

class Main{
    public static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(str[i]);
        }

        long[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Long, Integer> valueToIndex = new HashMap<>();
        int uniqueValue = 0;

        for (int i = 0; i < temp.length; i++) {
            if (!valueToIndex.containsKey(temp[i])) {
                valueToIndex.put(temp[i], uniqueValue++);
            }
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = valueToIndex.get(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}