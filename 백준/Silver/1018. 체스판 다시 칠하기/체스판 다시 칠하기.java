import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] list = new char[N][M];

        int N_max = N - 7;
        int M_max = M - 7;

        // 배열 입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                list[i][j] = str.charAt(j);	// W일 때는 true
            }
        }

        int countA = 0;
        int countB = 0;
        int count = 0;
        int Min = 0;
        for(int i = 0; i<N_max; i++){
            for(int j = 0; j<M_max; j++){
                char B = list[i][j];
                for(int k = 0; k<8; k++){
                    for(int l = 0; l<8; l++){
                        if((k+l)%2 == 0){
                            if(list[i+k][j+l] != B){
                                countA++;
                            }else{
                                countB++;
                            }
                        }else if((k+l)%2 == 1 ){
                            if(list[i+k][j+l] != B){
                                countB++;
                            }else{
                                countA++;
                            }
                        }
                    }
                }
                if( countA < countB){
                    count = countA ;
                }else{
                    count = countB;
                };
                if((i == 0 && j == 0) | Min > count){
                    Min = count;

                }
                count = 0 ;
                countA = 0 ;
                countB = 0 ;
            }
        }
        System.out.println(Min);
    }
}