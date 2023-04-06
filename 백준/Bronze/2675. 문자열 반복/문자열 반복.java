import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] str1 = br.readLine().split(" ");
                       
            int a = Integer.parseInt(str1[0]);

            for(byte val:str1[1].getBytes()) {
                for(int j = 0; j < a; j++) {
                    sb.append((char)val);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}