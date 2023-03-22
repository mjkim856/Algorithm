import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T, A;
        T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
            int B = 0;
            A = sc.nextInt();
            while(A > 0) {
                if(A%2 == 1) {
                    B += A;
                } else {
                    B -= A;
                }
                A--;
            }
            System.out.printf("#%d %d\n", i, B);
        }
    }
}