import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Main{
    public static int n;
    public static String s;
    public static char[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            n = (int) Math.pow(3, Double.parseDouble(s));
            arr = new char[n+1];
            Arrays.fill(arr,' ');
            cantoer(1, n, n);
            for (int i = 1; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void cantoer(int a, int b, int size) {
        if (size == 1) {
            arr[a] = '-';
        } else {
            int nsize = size / 3;
            cantoer(a, a + nsize - 1, nsize);
            cantoer(b - nsize + 1, b, nsize);
        }


    }
}
