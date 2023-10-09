import java.io.*;
import java.rmi.server.ExportException;
import java.util.Stack;

class Main{
    public static String s;
    public static boolean ch;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> arr = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while(!(s=br.readLine()).equals(".")){
            try {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(') {
                        arr.push(1);
                    } else if (s.charAt(i) == '[') {
                        arr.push(2);
                    } else if (s.charAt(i) == ']') {
                        if (arr.peek() == 1) {
                            sb.append("no").append("\n");
                            ch = true;
                            break;
                        } else {
                            arr.pop();
                        }
                    } else if (s.charAt(i) == ')') {
                        if (arr.peek() == 2) {
                            sb.append("no").append("\n");
                            ch = true;
                            break;
                        } else {
                            arr.pop();
                        }
                    } else {
                        continue;
                    }
                }

            } catch (Exception e){
                sb.append("no").append("\n");
                ch = true;
                arr.clear();
            }

            if (arr.isEmpty() && !ch) {
                sb.append("yes").append("\n");
            } else if (!ch) {
                sb.append("no").append("\n");
            }

            ch = false;
            arr.clear();
        }

        System.out.println(sb.toString());
    }
}