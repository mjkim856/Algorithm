import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            
            if(a == 0 && b == 0) break;
            
            if(b%a == 0) 
                sb.append("factor\n");
            else if(a%b == 0) 
                sb.append("multiple\n");
            else 
                sb.append("neither\n");
        }
        System.out.println(sb);
    }
}