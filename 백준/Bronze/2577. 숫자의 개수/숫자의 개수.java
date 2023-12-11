import java.io.*;

class Main{
    public static int a,b,c;
    public static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        String result = Integer.toString(a*b*c);
        arr = new int[10];
        for (int i = 0; i < result.length(); i++) {
            arr[Integer.parseInt(String.valueOf(result.charAt(i)))]++;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}