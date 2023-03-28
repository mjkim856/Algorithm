import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            q.clear();
            int minus = 1;

            for (int j = 0; j < 8; j++) {
                q.add(sc.nextInt());
            }

            while(true) {
                int temp = q.poll() - minus;
                minus++;
                if(temp <= 0) {
                    temp = 0;
                }
                q.add(temp);

                if(minus == 6) {
                    minus = 1;
                }

                if(temp == 0) {
                    System.out.print("#" + n + " ");
                    for (int j = 0; j < 8; j++) {
                        System.out.print(q.poll() + " ");
                    }
                    System.out.println();
                    break;
                }
            }
            System.out.printf("");
        }
    }
}