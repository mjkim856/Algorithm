// 시험 본 n가지 과목 중, 최고점인 m을 찾는다.
// 다른점수/m*100 으로 모든 점수를 변경한다.
// 절대오차 혹은 상대오차에 신경써야 하는 문제이다.

// 문제 이해를 잘못했음. '모든 점수'/m*100인데, 최고점을 뺀 나머지 점수에만 연산을 해서 자꾸 틀렸음.


import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String[] str = br.readLine().split(" ");
        ArrayList<Double> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(Double.parseDouble(str[i]));
        }
        
        Collections.sort(arr);
        double max = arr.get(n-1);
        double sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr.get(i)/max*100;
	}
        
        System.out.print(sum/n);
	}
}
