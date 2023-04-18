
class Solution {
    public String solution(int age) {
        String answer = "";
        // 소문자 a = 97
        String[] arr = String.valueOf(age).split("");;

        for(String a:arr) {
            int n = Integer.parseInt(a) + 97;
            char c = (char)n;
            answer += String.valueOf(c);

        }                                
        return answer;
    }
}