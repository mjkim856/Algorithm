// 정수 n개로 이루어진 수열 a가 있고, 그 중 정수 x보다 작은 수를 출력한다.
// 출력 형식 : 1 2 3 4

import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st2.nextToken());
            if(a < x) {
                sb.append(a + " ");
            }
        }
        System.out.print(sb.toString());
    }
}