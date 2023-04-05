import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int m = 0;
        int r = 0;
        
        if(a == b && b == c) m = 10000 + (a*1000);
        else if (a == b && b != c) m = 1000 + a*100;
        else if (b == c && a != c) m = 1000 + b*100;
        else if (a == c && b != a) m = 1000 + c*100;
        else {
            r = (a > b) ? a : b;
            m = (r > c) ? r : c;
            m *= 100;
        }
        System.out.print(m);
    }
}