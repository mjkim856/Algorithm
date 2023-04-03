import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        int max = -1;
        int row = 0;
        int col = 0;
        int arrt = 0;

        for(int i = 0; i < 9; i++) {
            st1 = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                arrt = Integer.parseInt(st1.nextToken());
                if(arrt > max) {
                    max = arrt;
                    row = i+1;
                    col = j+1;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(row).append(" ").append(col);
        System.out.println(sb);

        br.close();
    }
}