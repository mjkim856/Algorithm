// 정수 n개로 이루어진 수열 a가 있고, 그 중 정수 x보다 작은 수를 출력한다.
// 출력 형식 : 1 2 3 4

import java.util.*;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a < x) {
                System.out.print(a + " ");
            }
        }
    }
    
}