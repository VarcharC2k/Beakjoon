import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Main{
    public static int[][] page;
    public static int n,width,height;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        page = new int[100][100];
        StringTokenizer st;
        ArrayList<Integer> arr = new ArrayList<>();

        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());

            for(int j = width; j < width+10; j++){
                for(int k = height; k < height+10; k++){
                    page[j][k] = 1;
                }
            }
        }

        br.close();
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(page[i][j] == 1){
                    arr.add(1);
                }
            }
        }

        System.out.println(arr.size());
    }
}