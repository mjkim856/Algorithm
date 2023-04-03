// BufferedReader, StringBuilder, 재귀함수, while 사용해서 푸는 방법
    
import java.util.*;
import java.io.*;

class Main {
    // 클래스 전역에서 사용하기 위해 static 배열을 선언한다.
    // 전역 변수(global variable)는 프로그램 전체에서 사용되는 변수를 의미합니다. 
    // 반면 클래스 변수(class variable)는 클래스 내부에서 선언된 변수를 의미합니다.
    // 클래스 변수는 전역 변수의 일종이지만, 반드시 전역 변수가 클래스 변수인 것은 아닙니다.
    public static long dp[] = new long[101];
    
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 초기값 설정
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        
        // 테스트케이스 받아오기
        int t = Integer.parseInt(br.readLine());
        
        // t만큼 반복한다. (2라면 2번)
        while(t-- > 0) {
            // 받아온 값을 int로 변경 후 pado()에 삽입하고 그 값을 append한다.
            // 뒤에 줄바꿈('n')을 append한다.
            sb.append(pado(Integer.parseInt(br.readLine()))).append('\n');
        }
        // 값 출력하기
        System.out.println(sb);
    }
    
    // 재귀함수 pado
    public static long pado(int n) {
        // 만약 dp[n]의 값이 0이라면 아직 해당 배열의 값이 없다는 것이므로, 재귀함수를 사용한다.
        // 만약 dp[n]의 값이 0이 아니라면 dp[n]의 값을 return한다.
        if(dp[n] == 0) {
            dp[n] = pado(n - 2) + pado(n - 3);
        }
        return dp[n];
    }
}

-
    
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

