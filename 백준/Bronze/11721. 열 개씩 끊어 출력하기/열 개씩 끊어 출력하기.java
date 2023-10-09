import java.io.*;

class Main{
    public static String s;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();

        for(int i = 0; i < s.length(); i++){
            sb.append(String.valueOf(s.charAt(i)));
            if((i+1) % 10 == 0){
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}