import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1;
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
        System.out.println(sb);
    }
}