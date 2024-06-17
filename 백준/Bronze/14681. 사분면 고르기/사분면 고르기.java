import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a > 0){
            if(b > 0){
                bw.write("1");
                bw.flush();
            } else {
                bw.write("4");
                bw.flush();
            }
        } else {
            if(b > 0){
                bw.write("2");
                bw.flush();
            } else {
                bw.write("3");
                bw.flush();
            }
        }
        
        bw.close();
        br.close();
    }
    
}