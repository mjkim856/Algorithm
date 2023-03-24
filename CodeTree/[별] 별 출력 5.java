***** ***** ***** ***** ***** 
**** **** **** **** 
*** *** *** 
** ** 
* 

-

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    for (int k = 0; k < i; k++) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        sc.close();
    }
}
