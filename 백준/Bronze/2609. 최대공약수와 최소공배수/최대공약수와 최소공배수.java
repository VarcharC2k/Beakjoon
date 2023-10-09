import java.io.*;

class Main{
    public static int a,b;
    public static String[] str;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        System.out.println(getGcd(a,b));
        System.out.println((a*b) / getGcd(a,b));
        
    }
    
    public static int getGcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return getGcd(b, a%b);
    }
}