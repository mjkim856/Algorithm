import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        // arrayList인가? 아니면 linkedList인가?
        // 추가와 삭제가 빈번하므로 LinkedList를 사용해야 한다고 생각한다!
        // 테스트케이스가 10개이므로, 10번 반복한다.
        // 먼저, readLine()을 사용해서 원본 암호문의 길이를 받는다.
        // 다음으로, readLine()을 사용해서 원본 암호문을 받는다.
        //  StringTokenizer를 사용해서 나눈 숫자들을 LinkedList origin에 담는다.
        // 다음으로, 명령어의 갯수를 받고 명령어의 갯수만큼 실행한다.
        // 'I'를 기점으로 처리기를 나눈다.
        // 만약 i가 나온다면
        //      sc.nextInt() 자리 다음에
        //      sc.nextInt() 만큼 반복하고
        //      origin(1+5) = sc.nextInt()이다.
        // 한 과정이 종료된다면 테스트케이스 번호와 < 10개만큼 출력한다.
        // 이 과정을 10회 실행한다.
        //

        for (int i = 0; i < 10; i++) {
            int originLength = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
//            System.out.println(str);
            StringTokenizer st = new StringTokenizer(str);
            LinkedList<Integer> list = new LinkedList<>();
            while(st.hasMoreTokens()) {
                list.add(Integer.valueOf(st.nextToken()));
            }

            int a = sc.nextInt(); // 명령어 갯수
            for (int j = 0; j < a; j++) {
                sc.next();              // 'I' 뛰어넘는다.
                int x = sc.nextInt();   // idx x번째부터
                int y = sc.nextInt();   // y개를 넣는다 (반복의 기준이 된다)
                for (int k = 0; k < y; k++) {
                    int temp = sc.nextInt();
//                    System.out.println(temp);
                    list.add(k+x, temp);
                    // list.set(k+x, temp);
                }
            }
            System.out.printf("#%d ", i+1);
            for (int j = 0; j < 10; j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();

        }

    }
}
