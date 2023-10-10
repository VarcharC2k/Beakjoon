import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static long m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            m = Long.parseLong(br.readLine());
            while(true){
                if(isPrime(m)){
                    System.out.println(m);
                    break;
                }
                m++;
            }
        }
    }

    public static boolean isPrime(long num){
        if(num == 1) {
            return false;
        } else if(num==2){
            return true;
        } else if(num%2==0){
            return false;
        } else{
            for(int i = 3; i <= (int) Math.sqrt(num); i += 2){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}