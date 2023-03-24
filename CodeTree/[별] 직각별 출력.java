*
***
*****
*******
*********

n = 5
점화식 : 2n + 1
1 : 1개  |   i = 0
2 : 3개  |   i = 1
3 : 5개  |   i = 2
4 : 7개  |   i = 3
5 : 9개  |   i = 4

-

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2*i + 1); j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
