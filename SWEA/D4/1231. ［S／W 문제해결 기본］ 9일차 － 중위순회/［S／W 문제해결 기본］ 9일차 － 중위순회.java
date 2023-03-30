import java.util.*;
import java.io.*;

public class Solution {
	static int n;
	static String[] arr;

	public static void inOrder(int idx) {
		if (idx*2 <= n) inOrder(idx*2);
		System.out.print(arr[idx]);
		if (idx*2+1 <= n) inOrder(idx*2+1);
	}

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for(int i = 0; i < 10; i++) {
		n = Integer.parseInt(br.readLine());
		arr = new String[n+1];
			
			for(int j = 0; j < n; j++) {
				String str = br.readLine();
				st = new StringTokenizer(str, " ");
				arr[Integer.parseInt(st.nextToken())] = st.nextToken();
			}

		System.out.printf("#%d ", i+1);
		inOrder(1);
		System.out.println();
		}
	}
}

-
	
주석 있는 버전

import java.util.*;
import java.io.*;

public class Solution {
	// class에서 사용할 staic함수를 선언한다.
	static int n;
	static String[] arr;

	// inOrder(idx)라는 이름으로 재귀함수를 선언한다. (중위순회가 inOrder라고 함!)
	public static void inOrder(int idx) {
		// 만약 idx에 2를 곱한 값이 a와 같거나 작다면 왼쪽자식이 있다는 뜻임. inOrder에 2*idx를 넣어주자.
		if (idx*2 <= n) inOrder(idx*2);
		// 배열명[idx]를 출력한다.
		System.out.print(arr[idx]);
		// 만약 idx에 2를 곱하고 1을 더한 값이 a보다 작다면 오른쪽 자식이 있다는 뜻임. inOrder에 2*idx+1을 넣어주자.
		if (idx*2+1 <= n) inOrder(idx*2+1);
	}

	public static void main(String args[]) throws IOException{

		// BufferedReader와 StringTokenizer를 사용할 것이므로 미리 생성한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 테스트 케이스가 10개이므로, 총 10번 반복한다. (int n)
		for(int i = 0; i < 10; i++) {

		// 맨 위에 주어지는 수는 요소의 갯수이다. br.readLine()을 사용해 받는다. (int n)
		n = Integer.parseInt(br.readLine());

		// 1차원 배열을 사용하여 문제를 풀 것이고, 1부터 요소가 주어지므로 [요소 갯수 + 1] 의 int 배열을 만들 것이다.
		arr = new String[n+1];

			// 배열의 인덱스마다 해당하는 요소를 넣어야 하기에 요소 갯수(n)만큼 반복문을 사용한다.
			for(int j = 0; j < n; j++) {
				// 한 줄을 통째로 받고, stringTokenizer를 사용해서 띄어쓰기 기준으로 자른다.
				String str = br.readLine();
				st = new StringTokenizer(str, " ");
				// 배열의 인덱스(nextToken) = 요소값(nextToken)이다. 뒤에 오는 건 무시한다.
				arr[Integer.parseInt(st.nextToken())] = st.nextToken();
				// 값이 들어간 배열 완성!
			}

		// 반복문이 끝났다면 inOrder(1)을 실행한다.
            System.out.printf("#%d ", i+1);
			inOrder(1);
			System.out.println();
		}
	}
}
