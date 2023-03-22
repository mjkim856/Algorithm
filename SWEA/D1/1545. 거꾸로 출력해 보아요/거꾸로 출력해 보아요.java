import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        if(T >= 0) {
            for (int i = T; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
