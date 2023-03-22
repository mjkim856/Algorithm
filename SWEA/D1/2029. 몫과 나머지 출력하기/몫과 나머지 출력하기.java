import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T, a, b, c, d;
        T = sc.nextInt();
        for(int i = 1; i <= T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            d = a%b;
            System.out.printf("#%d %d %d\n", i, c, d);
        }
    }
}