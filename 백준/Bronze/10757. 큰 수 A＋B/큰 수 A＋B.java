import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        BigInteger a = new BigInteger(s[0]);
        BigInteger b = new BigInteger(s[1]);
        BigInteger sum = a.add(b);
        
        System.out.println(sum);
    }
}

-
    
BigInteger 메소드

BigInteger a = new BigInteger("9223372036854775807");
BigInteger b = new BigInteger("9223372036854775808");
BigInteger sum = a.add(b);              // 덧셈
BigInteger dif = a.subtract(b);         // 뺄셈
BigInteger mul = a.multiply(b);         // 곱셈
BigInteger div = a.divide(b);           // 나눈 몫
BigInteger rem = a.remainder(b);        // 나눈 나머지

System.out.println(sum);
System.out.println(dif);
System.out.println(mul);
System.out.println(div);
System.out.println(rem);
System.out.println("a: " + a + ", b: " + b);

-

출력
18446744073709551615
-1
85070591730234615856620279821087277056
0
9223372036854775807
a: 9223372036854775807, b: 9223372036854775808

