import java.util.*;
import java.lang.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();       // 테스트 케이스의 개수
        sc.nextLine();          // nextInt() 하고 바로 값 불러오면 "" 반환한다. 다음 줄로 넘겨줘야 한다.

for(int i = 1; i <= N; i++) {
            int result = 0;
            String str = sc.nextLine().trim();
            int idxLength = str.length() - 1;

            if(idxLength%2 == 0) {
                for(int j = 0; j < idxLength/2; j++) {
                    if(str.charAt(j) != str.charAt(idxLength - j)) {
                        break;
                    } else {
                        result = 1;
                    }
                }
            } else {
                for(int j = 0; j <= idxLength/2; j++) {
                    if(str.charAt(j) != str.charAt(idxLength - j)) {
                        break;
                    } else {
                        result = 1;
                    }
                }
            }
            System.out.printf("#%d %d\n", i, result);
        }

         sc.close();
    }
}