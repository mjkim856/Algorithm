// 시험 본 n가지 과목 중, 최고점인 m을 찾는다.
// 다른점수/m*100 으로 모든 점수를 변경한다.
// 절대오차 혹은 상대오차에 신경써야 하는 문제이다.
import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        
        String[] str = br.readLine().split(" ");
        ArrayList<Double> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(Double.parseDouble(str[i]));
        }
        
        Collections.sort(arr);
        double max = arr.get(n-1);
        
	    for(int i = 0; i < n; i++) {
            arr.set(i, arr.get(i)/max*100);
	    }
        
        for(int i = 0; i < n; i++) {
            sum += arr.get(i);
	    }
        
        System.out.print(sum/n);
	}
}