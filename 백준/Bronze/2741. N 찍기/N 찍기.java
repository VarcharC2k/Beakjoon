import java.io.*;

class Main{
    public static int n;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}