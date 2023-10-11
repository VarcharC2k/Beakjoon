import java.io.*;
import java.util.*;

class Main{
    public static int n,temp,maxCnt;
    public static double sum;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> arr = new HashMap<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());
            sum += temp;
            num.add(temp);
            arr.put(temp, arr.getOrDefault(temp, 0) + 1);
            maxCnt = Math.max(maxCnt, arr.get(temp));
        }

        System.out.println(Math.round(sum / n));
        
        Collections.sort(num);
        System.out.println(num.get(num.size()/2));

        ArrayList<Integer> sortArr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : arr.entrySet()) {
            if (entry.getValue() == maxCnt) {
                sortArr.add(entry.getKey());
            }
        }

        Collections.sort(sortArr);
        if (sortArr.size() > 1) {
            System.out.println(sortArr.get(1));
        } else {
            System.out.println(sortArr.get(0));
        }

        System.out.println(num.get(num.size()-1) - num.get(0));

    }
}