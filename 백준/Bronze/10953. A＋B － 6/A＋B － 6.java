import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0 ; i < a ; i++) {
            String b = sc.next();
            StringTokenizer str = new StringTokenizer(b, ",");
            int n1 = Integer.parseInt(str.nextToken());
            int n2 = Integer.parseInt(str.nextToken());
            System.out.println(n1 + n2);
        }
        sc.close();
    }
}