import java.io.*;
import java.util.*;

class Main{
    public static int n,k;
    public static String[] str;
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);
        Map<String, Integer> arr = new HashMap<>();

        for(int i = 0; i < n; i++){
            s = br.readLine();
            if(s.length() < k){
                continue;
            }
            arr.put(s, arr.getOrDefault(s, 0)+1);
        }

        List<String> words = new ArrayList<>(arr.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.compare(arr.get(o1), arr.get(o2)) != 0) {
                    return Integer.compare(arr.get(o2), arr.get(o1));
                }

                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }

                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w).append("\n");
        }
        System.out.println(sb.toString());
    }
}