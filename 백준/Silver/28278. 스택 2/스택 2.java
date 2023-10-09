import java.io.*;
import java.util.*;

class Main{
    public static int n,temp;
    public static String[] str;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Stack<Integer> arr = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            str = br.readLine().split(" ");
            temp = Integer.parseInt(str[0]);

            if(temp == 1){
                arr.push(Integer.parseInt(str[1]));
            } else if(temp == 2){
                if(arr.isEmpty()){
                    sb.append(-1).append("\n");
                } else{
                    sb.append(arr.pop()).append("\n");
                }
            } else if(temp == 3){
                sb.append(arr.size()).append("\n");
            } else if(temp ==4){
                if(arr.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                if(arr.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(arr.get(arr.size()-1)).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}