import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        if(n>0 && m>0) System.out.print(1);
        else if(n<0 && m>0) System.out.print(2);
        else if(n<0 && m<0) System.out.print(3);
        else System.out.print(4);
    }
}