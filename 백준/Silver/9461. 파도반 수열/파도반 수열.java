// 점화식 규칙 : P[n] = P[n-2] + P[n-3]
// 테이블 초기값 : P[1] = 1, P[2] = 1, P[3] = 1
// int 배열을 만든다. 이 때, 0은 사용하지 않으므로 배열의 크기는 n+1이다.
// 총 반복은 t만큼 된다. int 배열 초기화를 잊지 말자.
// for문을 사용하여 idx 3부터 n까지 값 넣는 걸 반복한다.
// n번째 인덱스를 출력한다.

import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        long dp[] = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for(int j = 4; j <= n; j++) {
                dp[j] = dp[j-2] + dp[j-3];
            }     
            System.out.println(dp[n]);
        }
    }
}

