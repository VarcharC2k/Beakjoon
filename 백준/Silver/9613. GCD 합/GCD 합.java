import java.io.*;

class Main{
    public static int n,m;
    public static long sum;
    public static String[] str;
    public static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            m = Integer.parseInt(str[0]);
            arr = new int[m];
            sum = 0;

            for(int j = 0; j < m; j++){
                arr[j] = Integer.parseInt(str[j+1]);
            }

            for(int j = 0; j < arr.length-1; j++){
                for(int k = j+1; k < arr.length; k++){
                    sum += (long) getGcd(arr[j],arr[k]);
                }
            }

            System.out.println(sum);
        }
    }

    public static int getGcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return getGcd(b, a%b);
    }
}