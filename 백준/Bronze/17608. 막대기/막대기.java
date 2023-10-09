import java.io.*;
import java.util.*;

class Main{
    public static int n,min,cnt,temp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Stack<Integer> arr = new Stack<>();

        for(int i = 0; i < n; i++){
            arr.push(Integer.parseInt(br.readLine()));
        }

        min = arr.pop();
        cnt = 1;

        while(!arr.isEmpty()){
            temp = arr.pop();
            if(temp > min){
                min = temp;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}