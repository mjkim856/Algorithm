import java.util.Scanner;

public class Solution {
	public int solution(String s , String str) {
		int answer=0;
		//str.split(str);
		for(int i=0;i<str.length()-s.length()+1;i++) {
			if(s.equals(str.substring(0+i, s.length()+i))) {
				answer++;
			}
		}
		return answer;
		
		
	}
	public static void main(String[] args) {
		Solution T =new Solution();
		Scanner kb=new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			int n=kb.nextInt();
			String s=kb.next();
			String str=kb.next();		
			System.out.println("#"+i+" "+T.solution(s,str));
		}
		
	}

}