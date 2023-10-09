import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static int n;
    public static int[] num;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        num = new int[n];

        for(int i =0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        if(num.length == 1){
            System.out.println(num[0]*num[0]);
        } else {
            System.out.println(num[0]*num[num.length-1]);
        }
    }
}