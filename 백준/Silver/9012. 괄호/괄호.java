import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // peek()은 맨 위의 값을 반환한다. 삭제 아님!
        //      return elementAt(len - 1);
        // pop()은 맨 위의 값을 제거한다.
        //      removeElementAt(len - 1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = "";

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            System.out.println(isVPS(str));
        }
    }

    public static String isVPS(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(') {
                st.push(c);
            } else if(st.isEmpty()) {
                return "NO";
            } else {
                st.pop();
            }
        }

        if(st.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}