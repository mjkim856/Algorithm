// n장의 카드 중 3장을 골라 m과 가깝게 만드는 문제이다. 

import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 배열의 0번째부터 시작한다.
        // 카드 세 장을 뜻하는 int c1, c2, c3를 설정한다.
        // c1 = 0, c2 = 1, c3 = 2부터 시작한다.
        // c1 + c2 + c3의 값이 M 이하이면서 기존의 M보다 크다면 M에 넣는다.
        // c3를 1씩 늘려서 length와 같아지면 
        //    c2 + 1 한다.
        //    c3 = c2+1 이다.
        // 위 과정을 반복한다.
        // 만약 c2 == c3가 된다면
        //    c1 + 1 한다
        //    c2 = c1 + 1 한다
        //    c3 = c2 + 1 한다
        // 위 과정을 반복한다.
        // 만약 c1 == c3가 된다면
        // 모든 합이 구해진 것이므로 M을 반환한다.
        
        int c1 = 0;
        int c2 = 1;
        int c3 = 2;
        int max = -1;
        int l = arr.length;
        
        while(true) {
            int sum = arr[c1] + arr[c2] + arr[c3];
            if(sum > max && sum <= m) {
                max = sum;
            }
            
            c3++;
            
            if(c3 == l) {
                c2 += 1;
                c3 = c2 + 1;
                if(c2 == (l-1)) {
                    c1 += 1;
                    c2 = c1 + 1;
                    c3 = c2 + 1;
                }
            }

            if(c1 == (l-2)) {
                break;
            }
        }
        
        sb.append(max);
        System.out.print(sb);
    }
}
