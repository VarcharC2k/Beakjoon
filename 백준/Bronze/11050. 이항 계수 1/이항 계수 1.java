import java.io.*;
import java.util.*;

class Main{
    public static int n,k;
    public static int[][] bc;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        bc = new int[n+1][k+1];
        System.out.println(getBc(n,k));
    }

    public static int getBc(int a, int b){
        if(bc[a][b] > 0){
            return bc[a][b];
        }

        if(a == b || b == 0){
            return bc[a][b] = 1;
        }

        return bc[a][b] = getBc(a-1,b-1)+ getBc(a-1,b);

    }
}