import java.io.*;
import java.util.*;

class Main{
    public static long n;
    public static String[] str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Long.parseLong(br.readLine());
        HashMap<String, String> arr = new HashMap<>();

        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            if(str[1].equals("leave") && arr.containsKey(str[0])){
                arr.remove(str[0]);
            } else {
                arr.put(str[0],str[1]);
            }
        }

        StringBuilder sb = new StringBuilder();

        ArrayList<String> sortedArr = new ArrayList<>(arr.keySet());
        Collections.sort(sortedArr);
        Collections.reverse(sortedArr);
        for (String s : sortedArr) {
            sb.append(s).append("\n");
        }

        System.out.println(sb.toString());
    }
}