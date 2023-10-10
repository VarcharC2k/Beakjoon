import java.io.*;

class Main{
    public static int a, b;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(a*b);
    
    }
}