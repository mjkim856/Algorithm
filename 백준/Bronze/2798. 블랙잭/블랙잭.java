import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 숫자 n과 m을 받는다.
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        // 배열을 만들고, 배열에 값을 넣는다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // search()의 반환값을 int max에 담는다.
        int max = search(arr, n, m);
        System.out.print(max);
    }
    
    // 최댓값을 반환하기 위한 메소드 static int search() 를 선언한다.
    static int search(int[] arr, int n, int m) {
        // 최댓값을 넣을 max를 정의한다.
        int max = -1;
        // 맨 처음은 n-2까지 반복한다. 시작값은 i=0이다.
        for(int i = 0; i < n-2; i++) {
            // 그 다음은 n-1까지 반복한다. 시작값은 j=i+1이다.
            for(int j = i+1; j < n-1; j++) {
                // 그 다음은 n까지 반복한다. 시작값은 k=j+1이다.
                for(int k = j+1; k < n; k++) {
                    // 임시로 합을 담을 변수 temp를 선언한다.
                    int temp = arr[i] + arr[j] + arr[k];
                    // 만약 temp = m인 경우, return한다.
                    if(temp == m) return temp;
                    // 만약 temp가 m 이하이면서 max보다 크다면 max를 갱신한다.
                    if(temp < m && temp > max) max = temp;
                }
            }
        }
        // 모든 순회를 마치면 result를 리턴한다.
        return max;
    }
}
