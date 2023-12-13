import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static int[][] arr;
    public static String[] str;
    public static int[] result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        result = new int[3];

        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        check(0, 0, n);
        for (int num : result) {
            System.out.println(num);
        }

    }

    public static void check(int x, int y, int size) {
        boolean isEqual = true;
        int temp = arr[y][x];

        for (int i = y; i < y + size; i++) {
            if (!isEqual) break;
            for (int j = x; j < x + size; j++) {
                if(temp != arr[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            result[temp + 1]++;
        } else {
            int newSize = size / 3;
            for (int i = y; i < y + size; i += newSize) {
                for (int j = x; j < x + size; j += newSize) {
                    check(j,i,newSize);
                }
            }
        }

    }
}