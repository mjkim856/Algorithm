import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int a1 = Integer.parseInt(arr[0]);
        int b1 = Integer.parseInt(arr[1]);
        int a2 = 0;
        int b2 = 0;

        int n1 = a1/100;
        int n2 = (a1 - (n1*100))/10;
        int n3 = (a1 - (n1*100))%10;
        a2 = (n3*100) + (n2*10) + n1;
        
        int n4 = b1/100;
        int n5 = (b1 - (n4*100))/10;
        int n6 = (b1 - (n4*100))%10;
        b2 = (n6*100) + (n5*10) + n4;

        System.out.println(Math.max(a2, b2));
    }
}