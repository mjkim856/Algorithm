// N개의 바구니(처음엔 비어있음)에 M개의 줄을 걸쳐서 공을 넣는다.
// 2 5 6이라고 하면, 2번 바구니부터 5번 바구니까지 공번호 6을 넣는다는 뜻이다.
// 0 0 0 0 0 -> 3 3 0 0 0 -> 3 3 4 4 0 -> 1 1 1 1 0 -> 1 2 1 1 0
// BufferedReader와 split을 사용해서 n, m을 받는다.
// for i(m번 반복) 안에서 start(시작점) end(끝점) num(공번호) 를 받는다.
// for j 안에서 배열[start] 부터 배열[end] 까지 num을 넣는다.
// 반복이 끝나면 배열을 출력한다.
import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] arr = new int[n+1];
        
        for(int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            int num = Integer.parseInt(str[2]);
            
            for(int j = start; j <= end; j++) {
                arr[j] = num;
            }     
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        
        System.out.print(sb);
    }
}