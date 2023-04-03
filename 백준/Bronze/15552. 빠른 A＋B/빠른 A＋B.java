import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            sb.append(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]) + "\n");
        }
        System.out.println(sb);
    }
}