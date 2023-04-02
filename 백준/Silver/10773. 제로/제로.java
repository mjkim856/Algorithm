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