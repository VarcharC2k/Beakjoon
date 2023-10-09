import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static boolean isDance;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        HashSet<String> arr = new HashSet<>();

        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            if (str[0].equals("ChongChong") || str[1].equals("ChongChong")) {
                isDance = true;
                arr.add(str[0]);
                arr.add(str[1]);
            } else if (isDance) {
                if(arr.contains(str[0]) || arr.contains(str[1])){
                    arr.add(str[0]);
                    arr.add(str[1]);
                }
            }
        }

        System.out.println(arr.size());
    }
}