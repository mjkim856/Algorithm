import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        // 1. 숫자 n을 int에 담는다.
        // 2. 입력된 숫자를 charAt()을 사용해 n번만큼 반복한다.
        // 3. 입력된 숫자를 n번만큼 더한다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += str.charAt(i)-'0';
            // sum += str.charAt(i)-48;
        }
        System.out.println(sum);
    }
}