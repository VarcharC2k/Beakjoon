import java.io.*;
import java.util.*;

class Main{
    public static long n,m;
    public static String[] str;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        n = Long.parseLong(str[0]);
        m = Long.parseLong(str[1]);
        int result = bfs(n);
        System.out.println(result);
    }
    
    public static int bfs(long node){
        Queue<Long> q = new LinkedList();
        q.offer(node);
        int cnt = 1;
        
        while(!q.isEmpty()){
            int len = q.size();
            
            for(int i =0; i < len; i++){
                long temp = q.poll();
                if(temp == m){
                    return cnt;
                }
                if(temp*2 <= m){
                    q.offer(temp*2);
                }
                if(temp*10+1 <= m){
                    q.offer(temp*10+1);
                }
            }
            cnt++;
        }
        return -1;
    }
}