처음으로 시간 초과가 발생한 문제이다.
푸는 방법이야 많지만, 먼저 Scanner를 사용했다. 역시나 시간 초과 ...
다음으로는 BufferedReader를 사용했다. 무사 통과.
다음으로는 BufferedReader와 StringBuilder를 사용했다. 사용 시간이 절반으로 줄엇다. 뿌듯.
앞으로는 StringBuilder에 익숙해지도록 하자.

-

import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if(s[0].equals("push")) {
                st.push(Integer.parseInt(s[1]));
            } else if(s[0].equals("pop")) {
                sb.append(st.empty() ? -1 : st.pop()).append('\n');
            } else if(s[0].equals("top")) {
                sb.append(st.empty() ? -1 : st.peek()).append('\n');
            } else if(s[0].equals("size")) {
                sb.append(st.size()).append('\n');
            } else if(s[0].equals("empty")) {
                sb.append(st.empty() ? 1 : 0).append('\n');
            }
        }
        System.out.println(sb.toString());
	}
}

-
	
import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if(s[0].equals("push")) {
                st.push(Integer.parseInt(s[1]));
            } else if(s[0].equals("pop")) {
                System.out.println(st.empty() ? -1 : st.pop());
            } else if(s[0].equals("top")) {
                System.out.println(st.empty() ? -1 : st.peek());
            } else if(s[0].equals("size")) {
                System.out.println(st.size());
            } else if(s[0].equals("empty")) {
                System.out.println(st.empty() ? 1 : 0);
            }
        }
    }
}
