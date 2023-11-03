import java.io.*;
import java.util.*;

class Main{
    public static int n,max;
    public static int[][] arr;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        max = 0;

        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]==o2[1]?o1[0]-o2[0]:o1[1] - o2[1];
            }
        });

        int temp = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= temp) {
                max++;
                temp = arr[i][1];
            }
        }

        System.out.println(max);
    }

}