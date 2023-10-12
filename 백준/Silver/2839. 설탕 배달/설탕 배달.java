import java.io.*;

class Main{
    public static int n,min,temp, m, cnt3;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        min = Integer.MAX_VALUE;
        temp = n / 5;
        if (temp == 0) {
            if (n % 3 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(n/3);
            }
        } else {
            for (int i = temp; i >= 0; i--) {
                m = n - (i * 5);
                if (m % 3==0) {
                    cnt3 = m / 3;
                    if (min > cnt3 + i) {
                        min = cnt3 + i;
                    }
                }
            }
            if (min == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(min);
            }
        }


    }
}