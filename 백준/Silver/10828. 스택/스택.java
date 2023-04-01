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