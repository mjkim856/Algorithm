import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char c = br.readLine().charAt(0);
        sb.append((int)c);
        System.out.print(sb);
    }
}