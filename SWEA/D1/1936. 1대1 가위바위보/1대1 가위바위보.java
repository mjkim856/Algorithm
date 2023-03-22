import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a=sc.nextInt();
        b=sc.nextInt();
        String winner;

        // 바위 - 가위 = 1
        // 보 - 바위 = 1
        // 가위 - 보 = -2

        if((a - b == -2) || (a - b == 1)) {
            winner = "A";
        } else {
            winner = "B";
        }

        System.out.println(winner);

        /*
        if (a == 1) {
            winner = (b == 2 ? "B" : "A");
        } else if (a == 2) {
            winner = (b == 3 ? "B" : "A");
        } else {
            winner = (b == 1 ? "B" : "A");
        }
        */
    }
}