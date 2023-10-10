import java.io.*;
import java.util.*;

class Main{
    public static int n,m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] card = br.readLine().split(" ");

        m = Integer.parseInt(br.readLine());
        HashMap<String, Integer> arr = new HashMap<>();
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < m; i++){
            arr.put(str[i],0);
        }

        for(String s : card){
            if(arr.containsKey(s)){
                arr.put(s,arr.get(s)+1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(arr.get(s)).append(" ");
        }

        System.out.println(sb.toString());
    }
}