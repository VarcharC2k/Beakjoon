import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10; i++){
            bw.write(a + " * " + i + " = " + a*i + "\n");
            bw.flush();
        }

        bw.close();
        br.close();
    }
}