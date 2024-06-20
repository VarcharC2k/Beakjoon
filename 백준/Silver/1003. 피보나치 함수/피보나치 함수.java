import java.io.*;
import java.util.*;

class Main{

    public static int cnt,num;
    public static Integer[][] fibo;
    public static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = Integer.parseInt(br.readLine());
        fibo = new Integer[41][2];
        sb = new StringBuilder();
        fibo[0][0] = 1;
        fibo[0][1] = 0;
        fibo[1][0] = 0;
        fibo[1][1] = 1;

        for (int i = 0; i < cnt; i++) {
            num = Integer.parseInt(br.readLine());
            fiboChk(num);
            sb.append(fibo[num][0] + " " + fibo[num][1]).append("\n");
        }
        System.out.println(sb);
    }

    public static Integer[] fiboChk(int num) {
        if (fibo[num][0] == null || fibo[num][1] == null) {
            fibo[num][0] = fiboChk(num - 1)[0] + fiboChk(num - 2)[0];
            fibo[num][1] = fiboChk(num - 1)[1] + fiboChk(num - 2)[1];
            return fibo[num];
        } else {
            return fibo[num];
        }
    }
}