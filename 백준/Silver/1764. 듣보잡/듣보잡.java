import java.io.*;
import java.util.*;

class Main{
    public static int n,m,cnt;
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        HashMap<String, Integer> arr = new HashMap<>();
        for(int i = 0; i < n; i++){
            s = br.readLine();
            arr.put(s, 0);
        }

        StringBuilder sb = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < m; i++){
            s = br.readLine();
            if(arr.containsKey(s)){
                result.add(s);
                cnt++;
            }
        }

        Collections.sort(result);

        for (String s : result) {
            sb.append(s).append("\n");
        }
        System.out.println(cnt);
        System.out.println(sb.toString());

    }
}