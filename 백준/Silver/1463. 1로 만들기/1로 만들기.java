import javax.print.attribute.standard.PresentationDirection;
import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static Integer[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        if (n > 3) {
            for (int i = 0; i <= 3; i++) {

                dp[i] = 1;
            }
            System.out.println(recur(n));
        } else {
            if(n == 1){
                System.out.println(0);
            } else{
                System.out.println(1);
            }
            
        }
    }

    public static int recur(int n) {
        if (dp[n] == null) {
            for (int i = 4; i <= n; i++) {
                if (i % 6 == 0) {
                    dp[i] = Math.min(dp[i / 2], dp[i / 3]) + 1;
                } else if (i % 3 == 0) {
                    dp[i] = Math.min(dp[i - 1], dp[i / 3]) + 1;
                } else if (i % 2 == 0) {
                    dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1;
                } else {
                    dp[i] = dp[i - 1] + 1;
                }
            }
        }
        return dp[n];
    }
}