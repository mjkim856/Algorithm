import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        StringTokenizer st2;
        int max = -1;
        int row = 0;
        int col = 0;

        int[][] arrt1 = new int[9][9];
        
        for(int i = 0; i < 9; i++) {
            st1 = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                arrt1[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(arrt1[i][j] > max) {
                    max = arrt1[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(row + " " + col);

        br.close();
    }
}