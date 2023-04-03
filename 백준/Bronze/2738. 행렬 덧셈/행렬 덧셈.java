import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1; 
        StringTokenizer st2;
        
        String[] arr = br.readLine().split(" ");
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        int[][] arrt1 = new int[m][n];
        int[][] arrt2 = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            st1 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arrt1[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        
        for(int i = 0; i < m; i++) {
            st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arrt2[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(arrt1[i][j] + arrt2[i][j] + " ");
            }
            sb.append("\n");
        }        
        System.out.println(sb);
        br.close();
    }
}