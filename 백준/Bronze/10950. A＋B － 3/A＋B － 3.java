// 조금씩 머리를 굴려야 하는 문제가 나오고 있다.
// 실패 원인 : 5 1 3 5 2 6 3 2 이런 식으로 숫자가 주어지는데, 맨 앞 숫자는 쌍의 갯수이다.
//           :   몇 개가 주어지는지 모르니까 while(true)를 사용해야지!
//           :   NoSuchElementException이 뜬다. 앗 똑같은 오류 예제가 (^^...) ! 그럼 sc.hasnextInt()를 사용하자!
//           :   이래도 런타임 에러? 아 맨 앞이 쌍 갯수면 (이 때 파악) 이걸 for문에 사용해야겠구나!
//           : 라는 의식의 흐름을 사용했다. 완전 애자일 코테 ㅎㅎ ㅎㅎ ㅎ ... 
              
https://help.acmicpc.net/judge/rte/NoSuchElement              

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1 + n2);
        }
        sc.close();
    }
}
