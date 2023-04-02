import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a != 0) st.push(a);
            else st.pop();
        }
        
        int size = st.size();
        int sum = 0;
        for(int i = 0; i < size; i++) 
            sum += st.pop();
        
        sb.append(sum);
        System.out.print(sb);
    }
}