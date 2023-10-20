import java.io.*;
import java.util.*;

class Main{
    public static int n,m,k;
    public static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[15][15];

        for(int i = 0; i < n; i++){
            m = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());
            System.out.println(calp(m, k));
        }

    }

    public static int calp(int a, int b){

        if(arr[a][b] == 0){
            if(a==0){
                for(int i = 1; i <= b; i++){
                    arr[0][i] = i;
                }
            } else {
                for (int i = 1; i <= b; i++) {
                    arr[a][b] += calp(a - 1, i);
                }
            }
        }
        return arr[a][b];
    }
}