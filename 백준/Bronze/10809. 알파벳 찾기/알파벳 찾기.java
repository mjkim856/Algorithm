import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[26];
        
        for(int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            int a = (int)str.charAt(i) - 97;
            if(arr[a] == -1) arr[(int)str.charAt(i) - 97] = i; 
        }
        
        for(int a:arr) {
            sb.append(a).append(" ");
        }
        
        System.out.println(sb);
    }
}