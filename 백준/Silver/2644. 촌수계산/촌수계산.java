import java.io.*;
import java.util.*;

class Main{
    public static int n,a,b,m,result;
    public static ArrayList<ArrayList<Integer>> arr;
    public static boolean[] visit;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        m = Integer.parseInt(br.readLine());
        arr = new ArrayList();
        visit = new boolean[n+1];
        for(int i = 0; i <= n; i++){
            arr.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < m; i++){
            str = br.readLine().split(" ");
            int st = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            arr.get(st).add(end);
            arr.get(end).add(st);
        }
        
        result = -1;
        dfs(a,0);
        System.out.println(result);
    }
    
    public static void dfs(int node, int level){
        if(node == b){
            result = level;
            return;
        }
        
        visit[node] = true;
        ArrayList<Integer> temp = arr.get(node);
        for(int i = 0; i < temp.size(); i++){
            if(!visit[temp.get(i)]){
                dfs(temp.get(i),level+1);
            }
        }
    }
}
