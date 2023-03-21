import java.util.*;
import java.io.*;

public class Main {
    static long func(long a, long b) {
        return (a+b)*(a-b);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long result = func(a, b);

        System.out.println(result);
    }
}