import java.io.*;

class Main{
    public static int n,gcd;
    public static String[] str;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        str = br.readLine().split(" ");
        
        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        for(int i = 1; i < arr.length; i++){
            gcd = getGcd(arr[0],arr[i]);
            sb.append(arr[0]/gcd).append("/").append(arr[i]/gcd).append("\n");
        }
        
        System.out.println(sb.toString());
    }
    
    public static int getGcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return getGcd(b, a%b);
    }
}