import java.io.*;
import java.util.*;

class Main{
    public static int q,d,n,p,N,temp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N; i++){
            temp = Integer.parseInt(br.readLine());
            q = 0;
            d = 0;
            n = 0;
            p = 0;
            while(temp>0){
                if(temp>=25){
                    q = temp / 25;
                    temp %= 25;
                } else if(temp>=10){
                    d = temp / 10;
                    temp %= 10;
                } else if(temp>=5){
                    n = temp / 5;
                    temp %= 5;
                } else{
                    p = temp;
                    break;
                }
            }
            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}