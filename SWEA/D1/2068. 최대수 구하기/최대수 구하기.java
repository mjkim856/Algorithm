import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for(int i = 1; i <= T; i++) {
            int max = 0;
            for(int j = 1; j <= 10; j++) {
                int a = sc.nextInt();
                if(max < a) {
                    max = a;
                }
            }
            System.out.printf("#%d %d\n", i, max);
        }
    }
}