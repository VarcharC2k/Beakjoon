import java.io.*;
import java.util.*;

class Main{
    public static int n;
    public static String s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            s = br.readLine();
            if(arr.indexOf(s)<0)
            arr.add(s);
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (String str : arr) {
            System.out.println(str);
        }
    }
}