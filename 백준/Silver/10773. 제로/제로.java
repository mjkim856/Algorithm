총 네 가지 방법으로 풀었다.
가장 시간이 적게 걸린 건 두 번째 경우였으나, 전체적으로 봤을 때는 첫번째 경우가 가장 바람직(?) 했다.
메모리가 가장 적게 사용되고, 시간은 두번째 경우와 4ms만 차이났음.

array, BufferedReader, Stringbuilder, 향상된 for문  - 직접 자료구조 구현
array, BufferedReader, 향상된 for문                 - 직접 자료구조 구현
BuffderedReader, Stringbuilder, Stack, 향상된 for문 - STACK 사용
BuffderedReader, Stringbuilder, Stack, for문        - STACK 사용

__________________________________________________________________________________


array, BufferedReader, Stringbuilder, 향상된 for문  - 직접 자료구조 구현

// stack 직접 구현하기
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int top = -1;                              // 마지막 원소의 위치를 가리키는 변수를 선언한다.
        int n = Integer.parseInt(br.readLine());   // 입력 개수      
        int[] arr = new int[n];                    // 최대 크기가 n인 배열 생성

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());    //숫자를 입력받는다.
            if(num == 0) {        // 만약 숫자가 0이라면, top 위치를 1 감소시킨다.
                top--;
            } else {    
                top++;            // 만약 숫자가 0이 아니라면, top이 가리키는 위치(index)를 1 증가시킨다.
                arr[top] = num;   // top이 가리키는 곳을 입력받은 정수로 초기화한다.
            }
        }
        
        int sum = 0;
        for(int i = 0; i <= top; i++) {            // arr의 top까지 더한다.
            sum += arr[i];
        }
        
        sb.append(sum);
        System.out.print(sb);                     // 합을 출력한다.               
    }
}



__________________________________________________________________________________

array, BufferedReader, 향상된 for문                 - 직접 자료구조 구현

// stack 직접 구현하기
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int top = -1;                              // 마지막 원소의 위치를 가리키는 변수를 선언한다.
        int n = Integer.parseInt(br.readLine());   // 입력 개수      
        int[] arr = new int[n];                    // 최대 크기가 n인 배열 생성

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());    //숫자를 입력받는다.
            if(num == 0) {        // 만약 숫자가 0이라면, top 위치를 1 감소시킨다.
                top--;
            } else {    
                top++;            // 만약 숫자가 0이 아니라면, top이 가리키는 위치(index)를 1 증가시킨다.
                arr[top] = num;   // top이 가리키는 곳을 입력받은 정수로 초기화한다.
            }
        }
        
        int sum = 0;
        for(int i = 0; i <= top; i++) {            // arr의 top까지 더한다.
            sum += arr[i];
        }
        
        System.out.print(sum);                     // 합을 출력한다.
    }
}



__________________________________________________________________________________

BuffderedReader, Stringbuilder, Stack, 향상된 for문 - STACK 사용

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a != 0) st.push(a);
            else st.pop();
        }
        
        int sum = 0;
        for(int s:st)
            sum += s;
        
        sb.append(sum);
        System.out.print(sb);
    }
}



__________________________________________________________________________________

BuffderedReader, Stringbuilder, Stack, for문        - STACK 사용

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a != 0) st.push(a);
            else st.pop();
        }
        
        int size = st.size();
        int sum = 0;
        for(int i = 0; i < size; i++) 
            sum += st.pop();
        
        sb.append(sum);
        System.out.print(sb);
    }
}


