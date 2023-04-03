// 점화식 = dp[n] = dp[n-1] + dp[n-2]
// 초기값 : dp[0] = 0, dp[1] = 1, (dp[2] = 1)
// 예제 : 정수 한 개

import java.io.*;
import java.util.*;

public class Main {
    static long dp[];
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        dp = new long[n+1];

        for(int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = 1;

        System.out.println(pn(n));
    }

    public static long pn(int n) {
        if(dp[n] == -1) {
            dp[n] = pn(n-1) + pn(n-2);
        }
        return dp[n];
    }
}

-
    
import java.util.*;
import java.io.*;

class Main {    
    static long dp[] = new long[91];
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        int n = Integer.parseInt(br.readLine());
        System.out.println(pn(n));
    }
    
    public static long pn(int n) {
        if(dp[n] == 0) {
            dp[n] = pn(n-1) + pn(n-2);
        }
        return dp[n];
    }
}
