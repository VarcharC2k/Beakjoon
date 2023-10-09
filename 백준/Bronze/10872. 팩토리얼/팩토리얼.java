import java.io.*;

class Main{
    public static int n,sum;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        sum = 1;
        if(n == 0){
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            System.out.println(sum);
        }
    }
}
