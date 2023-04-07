// System.in.read()-48 사용
// int로 반환되나 해당 바이트의 아스키코드값을 반환하기에 -'0' 혹은 -48을 해야 한다.

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws Exception {

        int a = 0;
        int b = 0;

        a += System.in.read()-48;
        a += (System.in.read()-48)*10;
        a += (System.in.read()-48)*100;
        
        System.in.read();
        
        b += System.in.read()-48;
        b += (System.in.read()-48)*10;
        b += (System.in.read()-48)*100;
        
        System.out.println(Math.max(a, b));
    }
}

-
// StringBuilder의 .reverse().toString() 사용
// toString() 없이 사용하면 StringBuilder를 반환하기에 toString()처리를 해줘야 한다.    
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        
        System.out.println(Math.max(a, b));
    }
}

-

// 내가 한 방식 ...
// 내가 젤 조와하는 방식인 몫과 나머지 사용 ... 
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int a1 = Integer.parseInt(arr[0]);
        int b1 = Integer.parseInt(arr[1]);
        int a2 = 0;
        int b2 = 0;

        int n1 = a1/100;
        int n2 = (a1 - (n1*100))/10;
        int n3 = (a1 - (n1*100))%10;
        a2 = (n3*100) + (n2*10) + n1;
        
        int n4 = b1/100;
        int n5 = (b1 - (n4*100))/10;
        int n6 = (b1 - (n4*100))%10;
        b2 = (n6*100) + (n5*10) + n4;

        System.out.println(Math.max(a2, b2));
    }
}
