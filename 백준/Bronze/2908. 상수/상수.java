import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws Exception {

        int a = 0;
        int b = 0;

        a += System.in.read()-48;
        a += (System.in.read()-48)*10;
        a += (System.in.read()-48)*100;
        
        System.in.read();
        
        b += System.in.read()-48;
        b += (System.in.read()-48)*10;
        b += (System.in.read()-48)*100;
        
        System.out.println(Math.max(a, b));
    }
}