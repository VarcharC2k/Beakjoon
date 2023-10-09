import java.io.*;
import java.util.*;

class Main{
    public static int n,temp,result;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Stack<Integer> arr = new Stack<>();
        
        for(int i = 0; i < n; i++){
            temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                arr.pop();
            } else {
                arr.push(temp);
            }
        }
        
        result = 0;
        
        while(!arr.isEmpty()){
            result += arr.pop();
        }
        
        System.out.println(result);
    }
}