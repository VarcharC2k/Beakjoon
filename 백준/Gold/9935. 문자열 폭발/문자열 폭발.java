import java.io.*;
import java.util.*;

class Main{
    public static String str, bomb;
    public static int strlen, bomblen;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        bomb = br.readLine();
        strlen = str.length();
        bomblen = bomb.length();

        StringBuilder sb = new StringBuilder();

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));

            if (s.size() >= bomblen) {
                boolean isSame = true;

                for (int j = 0; j < bomblen; j++) {
                    if (s.get(s.size() - bomblen + j) != bomb.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    for (int j = 0; j < bomblen; j++) {
                        s.pop();
                    }
                }
            }
        }

        for (char ch : s) {
            sb.append(ch);
        }
        if (sb.length() < 1) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}