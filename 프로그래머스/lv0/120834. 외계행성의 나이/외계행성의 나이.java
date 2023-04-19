
class Solution {
    public String solution(int age) {
        String answer = "";
        String a = Integer.toString(age);
        
        // 소문자 a = 97

        // 1. charAt의 경우, 1이 아닌 1의 아스키코드가 반환된다.
        // 0은 a가 되어야 하고, a의 아스키코드는 97이고, 0의 아스키코드는 48이므로, 49를 더해줘야 한다.
        // charAt(i) 사용하면 숫자가 그대로 나오는 줄 알앗다. 엄청 시간 썻네 ...
        /*
        for(int i = 0; i < a.length(); i++) {
            answer += (char)(a.charAt(i) + 49);
        }                   
        */
        
        // 2. 내가 하고 싶었던 +97 방법을 사용하기 위해서는 숫자가 그대로 나와야 하고, 
        // split을 사용해서 int값을 한 자씩 받는 방법을 사용해야 한다.
        String[] arr = a.split("");
        for(int i = 0; i < a.length(); i++) {
            answer += (char)(Integer.parseInt(arr[i]) + 97);
        }
        return answer;
    }
}