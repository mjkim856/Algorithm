// 최대값의 인덱스를 찾아야 한다.
// 주의점! 말 그대로 순서라 0이 아닌 1부터 시작한다.

-
    
import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException{
        // 생각한 방법 1. array 사용 안 함
        // max=0과 idx=0을 선언한다.
        // 만약 br.readLine()가 max보다 클 경우, idx에 i를 넣는다.
        // 모든 숫자를 다 돈 후 max와 idx를 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int idx = 0;
        
        for(int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}

-
    
import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException{
        // 생각한 방법 2. array 사용
        // max=0과 idx=0과 int 배열을 선언한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int max = 0;
        int idx = 0;
        
        // for문을 사용하여 배열에 값을 넣는다.
        for(int i = 1; i <= 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
                
        // 만약 arr[i]가 max보다 클 경우, idx에 i를 넣는다.
        for(int i = 1; i <= 9; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        
        // 모든 숫자를 다 돈 후 max와 idx를 출력한다.
        System.out.println(max);
        System.out.println(idx);
    }
}
