import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) throws IOException {
        /*
        풀이 1. Scanner, for문, charAt(i) 사용

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if((i-9)%10 == 0) {
                System.out.println();
            }
        }
        sc.close();
        */

        // 풀이 2. BufferedReader, StringBuilder 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for(int i = 1; i <= str.length(); i++) {
            if(i%10 == 0) {
                sb.append(str.charAt(i-1)).append("\n");
            }  else {
                sb.append(str.charAt(i-1));
            }
        }

        System.out.print(sb.toString());
    }
}