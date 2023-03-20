import java.util.*;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     
        // 방법 1
        // 메모리: 20,124 kb, 실행시간: 134 ms
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
     
        // 방법 2
        // 메모리: 21,072 kb, 실행시간: 128 ms
        System.out.printf("%d\n%d\n%d\n%d", a+b, a-b, a*b, a/b);
     
        sc.close();
    }
}
