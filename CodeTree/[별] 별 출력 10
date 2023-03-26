4
* 
* * * * 
* * 
* * * 
* * * 
* * 
* * * * 
* 

-

규칙 찾는 게 어려웠던 문제!
1. 홀수 짝수 행 다르게 진행되는 거 찾는 것도 어려웠고
2. i와 출력 별 갯수간 규칙 찾기도 어려웠다

그래도 ㅜ 해냄!

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2*n; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < i/2+1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            if (i%2 == 1) {
                for (int j = 0; j < n-i/2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

-

다른 방법. plus와 minus 변수를 사용했다.
수학적 규칙 찾기 연습하는 게 아니라면 이게 더 직관적이고 좋다!

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        int m = n;

        for (int i = 0; i < 2*n; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < p; j++) {
                    System.out.print("* ");
                }
                p++;
            } else {
                for (int j = 0; j < m; j++) {
                    System.out.print("* ");
                }
                m--;
            }
            System.out.println();
        }
        sc.close();
    }
}
