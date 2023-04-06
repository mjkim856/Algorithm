import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            // 몇 번 반복할지, 어떤 문자열인지를 받아온다.
            String[] str1 = br.readLine().split(" ");
            
            // 문자열 반복횟수를 a에 담는다.            
            int a = Integer.parseInt(str1[0]);
            
            // 문자열을 s에 담는다.       
            String s = str1[1];

            // 다음 토큰을 a번만큼 반복한다.
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < a; k++) {
                    sb.append(s.charAt(j));
                }
            }

            // 한 루프가 끝나면 줄바꿈을 한다.
            sb.append("\n");
        }
        // 모든 루프가 끝나면 출력한다
        System.out.println(sb);
    }
}