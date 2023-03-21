import java.util.*;
import java.io.*;

public class Main {
    static int func(int a, int b) {
        return (a+b)*(a-b);
    }
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = func(a, b);

        System.out.println(result);
    }
}