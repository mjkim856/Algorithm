import java.io.*;

public class Main {
        public static void main(String[] args) throws Exception {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int a = Integer.parseInt(br.readLine());
//            String b = br.readLine();
//
//            System.out.println(a*(b.charAt(2) - '0'));
//            System.out.println(a*(b.charAt(1) - '0'));
//            System.out.println(a*(b.charAt(0) - '0'));
//            System.out.println(a*Integer.parseInt(b));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println(a*(b%10));
            System.out.println(a*(b%100/10));
            System.out.println(a*(b/100));
            System.out.println(a*(b));

        }
}
