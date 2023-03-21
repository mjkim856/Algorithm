import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // BufferedReader, for, while 사용!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = a; i >= 1; i--) {
            System.out.println(i);
        }

        /*
        while(a >= 1) {
            System.out.println(a);
            a--;
        }
        */
    }
}