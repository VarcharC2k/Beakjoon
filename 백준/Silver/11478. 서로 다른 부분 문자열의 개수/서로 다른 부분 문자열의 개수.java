import java.io.*;
import java.util.*;

class Main{
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        Set<String> arr = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                arr.add(s.substring(i, j));
            }
        }

        arr.remove("");
        System.out.println(arr.size());

    }
}