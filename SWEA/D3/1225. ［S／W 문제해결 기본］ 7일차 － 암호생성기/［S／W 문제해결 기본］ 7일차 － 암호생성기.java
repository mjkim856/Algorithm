import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            br.readLine();
            q.clear();

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 8; j++) {
                q.add(Integer.parseInt(st.nextToken()));
            }

            int minus = 1;

            while(true) {
                if(minus > 5) {
                    minus = 1;
                }
                int temp = q.poll() - minus++;
                if(temp <= 0) {
                    q.add(0);
                    break;
                }
                q.add(temp);
            }
            
            System.out.print("#" + i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }
    }
}

-

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
         // 빠르게 불러오기위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Queue 정의
        Queue<Integer> q = new LinkedList<>();

        // 테스트케이스가 10개라 10번 반복한다.
        for (int i = 1; i <= 10; i++) {
            // #i 형태로 넣을 거라 첫번째는 뛰어넘는다.
            br.readLine();
            // Queue 초기화 시킨다.
            q.clear();

            // br.readLine()을 사용한 한 줄을 StringTokenizer에 넣는다.
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 8개의 숫자가 주어지므로 8만큼 반복한다.
            for (int j = 0; j < 8; j++) {
                q.add(Integer.parseInt(st.nextToken()));
            }

            // 감소시킬 숫자 minus에 담음
            int minus = 1;

            while(true) {
                // 만약 숫자가 5 초과라면 1로 초기화시킨다.
                if(minus > 5) minus = 1;

                // temp(임시값) = Queue.poll() - minus
                // minus++는 이 식이 실행된 후 + 해준다.
                int temp = q.poll() - minus++;

                // 만약 temp가 0 이하라면?
                // Queue에 0을 더한 후, while을 빠져나간다.
                if(temp <= 0) {
                    q.add(0);
                    break;
                }

                // temp가 0 초과인 경우는 위 과정을 반복한다.
                q.add(temp);
            }

            // 정답 출력하는 부분 : #1 6 2 2 9 4 1 3 0 의 형태이다.
            System.out.print("#" + i + " ");

            for (int j = 0; j < 8; j++) {
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }
    }
}
