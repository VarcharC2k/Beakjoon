import java.io.*;
import java.util.*;

class Main{
    public static String s;
    public static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!(s=br.readLine()).equals("0") ){
            n = Integer.parseInt(s);
            System.out.println(findPrime(n));
        }
    }

    public static int findPrime(int num){
        boolean[] arr = new boolean[num*2+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        int result = 0;

        for(int i = 2; i * i <arr.length; i++){
            if (arr[i]){
                for(int j = i * i; j < arr.length; j+=i){
                    arr[j] = false;
                }
            }
        }

        for(int i = n+1; i < arr.length; i++){
            if(arr[i]){
                result++;
            }
        }

        return result;
    }
}