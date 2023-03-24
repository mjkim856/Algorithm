import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 개수 입력
        scanner.nextLine(); // 개행 문자 제거

        for (int test_case = 1; test_case <= T; test_case++) {
            String word = scanner.nextLine();
            boolean isPalindrome = true;

            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.printf("#%d %d\n", test_case, isPalindrome ? 1 : 0);
        }

        scanner.close();
    }

}