import java.io.*;
import java.util.*;

class Main{

    public static int n,white,blue;
    public static int[][] arr;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        blue = white = 0;
        cal(0,n,0,n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void cal(int xst, int xend, int yst, int yend) {
        int num = arr[yst][xst];
        boolean isEqual = true;

        for (int i = yst; i < yend; i++) {
            if(!isEqual) break;
            for (int j = xst; j < xend; j++) {
                if (num != arr[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            if (num == 0) {
                white++;
            } else {
                blue++;
            }
        } else {
            int xmid = (xst + xend) / 2;
            int ymid = (yst + yend) / 2;
            cal(xst, xmid, yst, ymid);
            cal(xmid, xend, yst, ymid);
            cal(xst, xmid, ymid, yend);
            cal(xmid, xend, ymid, yend);
        }
    }
}