이차원 배열의 개념을 이용하여 굳이 이차원 배열을 만들지 않고도 풀 수 있다.

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

-

이차원 배열 사용하여 풀기

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
