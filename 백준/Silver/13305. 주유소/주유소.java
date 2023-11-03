import java.io.*;
import java.util.*;

class Main{
    public static int n,result;
    public static int[] city, mile;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        str = br.readLine().split(" ");
        mile = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            mile[i] = Integer.parseInt(str[i]);
        }
        city = new int[n];
        str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            city[i] = Integer.parseInt(str[i]);
        }


        int oil = city[0];
        int temp = mile[0];
        result = 0;

        for (int i = 1; i < n-1; i++) {
            if (oil > city[i]) {
                result += oil * temp;
                oil = city[i];
                temp = mile[i];
            } else {
                temp += mile[i];
            }
        }

        result += oil * temp;
        System.out.println(result);
    }
}