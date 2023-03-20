// !! 주의점 !!
// 무슨 방법이든 값이 char / byte로 반환되는데, -48 혹은 -'0' 해주는 걸 잊지 말자.
// BufferedReader가 소요 시간도 짧고, 소모 메모리도 적다. 사용법에 익숙해지자.

import java.lang.*;
import java.io.*;
import java.util.*;

// 방법 1. BufferedReader 사용
// readLine, 향상된 for문, br.readLine().getBytes()
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;
        for(byte num : br.readLine().getBytes()) {
            sum += num - 48;
        }
        System.out.println(sum);
    }
}

// 방법 2. Scanner 사용
// for문, str.charAt(i)
public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += str.charAt(i)-'0';
        }
        
        System.out.println(sum);
    }
}
