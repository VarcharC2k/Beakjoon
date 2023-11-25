import java.io.*;
import java.util.*;

class Main{
    public static String s;
    public static String[] str, nums;
    public static int result, minus;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();

        str = s.split("[\\-]");
        result = 0;
        minus = 0;
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                nums = str[0].split("\\+");
                for (String num : nums) {
                    result += Integer.parseInt(num);
                }
            } else {
                nums = str[i].split("\\+");
                for (String num : nums) {
                    minus += Integer.parseInt(num);
                }
            }
        }

        System.out.println(result - minus);
    }
}