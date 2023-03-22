import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        for(int i = 1; i <= N/2; i++) {
            if(N%i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(N);
    }
}