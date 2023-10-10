import java.io.*;

class Main{
    public static int n,a,b,min,max;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            if(a> b){
                min = b;
                max = a;
            } else {
                min = a;
                max = b;
            }

            if(min == 1){
                sb.append(max).append("\n");
            } else {
                int cnt = min;
                while(true){
                    if(cnt % min == 0 && cnt % max == 0){
                        sb.append(cnt).append("\n");
                        break;
                    } else{
                        cnt += min;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}