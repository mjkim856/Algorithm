import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] str1 = br.readLine().split(" ");
                       
            int a = Integer.parseInt(str1[0]);

            for(byte val:str1[1].getBytes()) {
                for(int j = 0; j < a; j++) {
                    sb.append((char)val);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

-
    
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

            // a번만큼 반복한다.
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
