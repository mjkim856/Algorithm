import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException{
        // 최대값의 인덱스를 찾아야 한다.
        // 주의점! 말 그대로 순서라 0이 아닌 1부터 시작한다.
        
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