import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int l = n/4;
        
        for(int i = 0; i < l; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
        br.close();
    }
}