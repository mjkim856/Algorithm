import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 알파벳 숫자 26을 가지는 배열을 생성한다.
        // 배열에 -1을 모두 넣는다.
        // 반복문을 사용한다.
        // 한 글자씩 읽어온다. 
        // arr[(int)charAt(i) - 96] = i 씩 해준다.
        // 배열 출력하기
        
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            int a = (int)str.charAt(i) - 97;
            if(a != -65 && arr[a] == -1) arr[(int)str.charAt(i) - 97] = i;
        }

        
        for(int a:arr) {
            System.out.print(a + " ");
        }
    }
}