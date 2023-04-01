// n개의 바구니를 m번 만큼 바꾼다. 이 수는 첫째 줄에 n m의 형태로 주어진다.
// 예제대로라면 : 1 2 3 4 5 -> 2 1 3 4 5 -> 2 1 4 3 5 -> 3 1 4 2 5 -> 3 1 4 2 5

// BufferedReader, StringTokenizer, split, StringBuilder 사용
import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]) throws IOException {       		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// 아래의 코드는 5 8과 같이 한 자리 수라면 정상 작동하나,
		// 5 12와 같은 경우라면 n=5, 띄어쓰기, m=1 과 같은 식으로 한 자리씩 불러오기에 알고리즘이 정상 작동하지 못한다.
		//    int n = br.read() - 48;
		//    br.read();
		//    int m = br.read() - 48;
		//    br.readLine();

		// split() 사용!
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

-
		
// Scanner 사용
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

