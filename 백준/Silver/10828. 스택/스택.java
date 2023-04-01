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