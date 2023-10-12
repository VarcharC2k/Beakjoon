import java.io.*;
import java.util.*;

class Main{
    public static int n,result;
    public static int money = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        money -= n;

        while(money != 0){
            if(money >= 500){
                result += money / 500;
                money %= 500;
            } else if(money >= 100){
                result += money / 100;
                money %= 100;
            } else if(money >= 50){
                result += money / 50;
                money %= 50;
            } else if(money >= 10){
                result += money / 10;
                money %= 10;
            } else if(money >= 5){
                result += money / 5;
                money %= 5;
            } else {
                result += money / 1;
                money %= 1;
            }
        }

        System.out.println(result);
    }
}