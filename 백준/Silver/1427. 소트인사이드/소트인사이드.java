import java.io.*;
import java.util.*;

class Main{
    public static String s;
    public static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        arr = new int[10];

        for(int i = 0; i < s.length(); i++){
            arr[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i]>0){
                sb.append(i);
                arr[i]--;
                i++;
            }
        }

        System.out.println(sb.toString());
    }
}