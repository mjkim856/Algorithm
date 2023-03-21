import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        /*
        풀이 1. Scanner 사용
        간단한 숫자는 형변환 안 해도 돼서 편하다!

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a-b);
        sc.close();
        */

        // 풀이 2. BufferedReader, StringTokenizer 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a - b);

        br.close();
    }
}