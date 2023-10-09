import java.io.*;
import java.util.*;

class Main{
    public static int n,temp;
    public static String[] str;
    public static int cnt = 1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Stack<Integer> arr = new Stack<>();

        str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++){
            temp = Integer.parseInt(str[i]);
            if(temp == cnt){
                cnt++;
                continue;
            } else {
                if(arr.isEmpty()){
                    arr.push(temp);
                } else {
                    if(arr.peek() == cnt){
                        arr.pop();
                        cnt++;
                        i--;
                    } else {
                        arr.push(temp);
                    }
                }
            }
        }

        while(!arr.isEmpty()){
            if(arr.pop() == cnt){
                cnt++;
            } else{
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");

    }
}
