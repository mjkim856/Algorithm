// n개의 바구니를 m번 만큼 바꾼다. 이 수는 첫째 줄에 n m의 형태로 주어진다.
// 예제대로라면 : 1 2 3 4 5 -> 2 1 3 4 5 -> 2 1 4 3 5 -> 3 1 4 2 5 -> 3 1 4 2 5

import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]) throws IOException {
        // 1. BufferedReader와 StringTokenizer를 사용해 n과 m을 받는다.
        // 2. int arr[] = new int[n+1]; 바구니 배열 생성
        // int temp1과 temp2를 선언한다. 각각 첫번째 두번째 배열의 값을 담을 것이다.
        // 3. m번만큼 반복한다.
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int[] arr = new int[n+1];    
        
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
     
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int idx1 = Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());
        
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
        }    
        
        for(int i = 1; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        
        System.out.print(sb.toString());
	}
}


