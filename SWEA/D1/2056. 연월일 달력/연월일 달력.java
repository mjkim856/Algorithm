import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, date, y, m, d;
        N = sc.nextInt();

        // 만약 m이 1 미만 12 초과라면 -1을 반환한다.
        // 만약 d가 1 미만 31 초과라면 -1을 반환한다.
        // 위 과정으로 유효하지 않은 값 걸러낸다.

        // 만약 m이 2라면 -> d가 28 초과라면 -1을 반환한다.
        // 만약 m이 4 || 6 || 9 || 11이라면 -> d가 30 초과라면 -1을 반환한다.

        // 출력하기
        // printf를 사용해서 출력한다.
        // 만약 3월인 경우, 03과 같이 출력해야하므로 %02d 와 같은 형식을 사용한다.

        for(int i = 1; i <= N; i++) {
            date = sc.nextInt();
            y = date/10000;
            m = (date - y*10000)/100;
            d = (date - y*10000)%100;

            if(d < 1 || d > 31 || m < 1 || m > 12) {
                System.out.printf("#%d -1 \n", i);
            } else if(m == 2 && d > 28) {
                System.out.printf("#%d -1 \n", i);
            } else if((m == 4 || m == 6 || m == 9 || m == 11) && d == 31) {
                System.out.printf("#%d -1 \n", i);
            } else {
                System.out.printf("#%d %04d/%02d/%02d \n", i, y, m, d);
            }
        }
        sc.close();
    }
}