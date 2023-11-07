import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Main{
    public static String s1, s2;
    public static int cnt;
    public static Integer[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s1 = br.readLine();
        s2 = br.readLine();
        dp = new Integer[s1.length()][s2.length()];

        cnt = lcs(s1.length() - 1, s2.length() - 1);
        System.out.println(cnt);

        }

    public static int lcs(int a,int b) {
        if (a < 0 || b < 0) {
            return 0;
        }

        if (dp[a][b] == null) {
            dp[a][b] = 0;
            if (s1.charAt(a) == s2.charAt(b)) {
                dp[a][b] = lcs(a - 1, b - 1) + 1;
            } else{
                dp[a][b] = Math.max(lcs(a - 1, b), lcs(a, b - 1));
            }
        }

        return dp[a][b];
    }
}