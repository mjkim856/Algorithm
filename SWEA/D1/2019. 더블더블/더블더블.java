import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T, a;
        T = sc.nextInt();
        a = 1;
        System.out.printf(a + " ");
        for (int i = 0; i < T; i++) {
            a = a*2;
            System.out.printf(a + " ");
        }
        sc.close();
    }
}