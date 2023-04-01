import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        // n개의 정수 중 최솟값과 최댓값을 구하는 프로그램을 작성한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int min = a;
        int max = a;
        
        for(int i = 0; i < n-1; i++) {
            int b = Integer.parseInt(st.nextToken());
            if(b < min) min = b;
            if(b > max) max = b;
        }
        
        System.out.print(min + " " + max);
    }
}

-
import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        // n개의 정수 중 최솟값과 최댓값을 구하는 프로그램을 작성한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 이렇게 할 필요 없이 최소값-1 최대값+1 넣어주는 방식이 더 직관적이다
        
        int a = Integer.parseInt(st.nextToken());
        int min = a;
        int max = a;
        
        for(int i = 0; i < n-1; i++) {
            int b = Integer.parseInt(st.nextToken());
            if(b < min) min = b;
            if(b > max) max = b;
        }
        
        System.out.print(min + " " + max);
    }
}
