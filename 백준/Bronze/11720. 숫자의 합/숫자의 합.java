import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;
        for(byte num : br.readLine().getBytes()) {
            sum += num - 48;
        }
        System.out.println(sum);
    }
}