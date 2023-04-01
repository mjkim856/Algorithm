// n개의 바구니를 m번 만큼 바꾼다. 이 수는 첫째 줄에 n m의 형태로 주어진다.
// 예제대로라면 : 1 2 3 4 5 -> 2 1 3 4 5 -> 2 1 4 3 5 -> 3 1 4 2 5 -> 3 1 4 2 5

// 1. BufferedReader와 StringTokenizer를 사용해 n과 m을 받는다.
// 2. int arr[] = new int[n+1]; 바구니 배열 생성
// int temp1과 temp2를 선언한다. 각각 첫번째 두번째 배열의 값을 담을 것이다.
// 3. m번만큼 반복한다.
//    

// 1. Scanner를 사용한다.
// 2. int arr[] = new int[n+1]; 바구니 배열 생성
// int temp1과 temp2를 선언한다. 각각 첫번째 두번째 배열의 값을 담을 것이다.
// 3. m번만큼 반복한다.
//    int 받은값1, 2 선언
//    temp1에는 arr[받은값1], temp2에는 arr[받은값2]를 넣는다.
//    arr[받은값1] = temp2, arr[받은값2] = temp1
// 4. 배열을 출력한다.

import java.util.*;

class Main{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();    
        
        int[] arr = new int[n+1];    
        
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
     
        for(int i = 0; i < m; i++) {
            int idx1 = sc.nextInt();
            int idx2 = sc.nextInt();
        
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
        
            sc.nextLine();
        }    
        
        for(int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}


