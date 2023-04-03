import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d\n", n, j, n*j);
        }        
    }
}

-
import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int j = 1; j <= 9; j++) {
            sb.append(n + " * " + j + " = " + n*j + "\n");
        }     
        System.out.println(sb);
    }
}
