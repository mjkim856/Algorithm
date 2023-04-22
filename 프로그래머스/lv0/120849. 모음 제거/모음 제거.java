class Solution {
    public String solution(String my_string) {
        
        /*
        방법 1. 문자열을 toCharArray로 변경해 한 글자씩 받아오게 한다.
               a e i o u가 모두 들어있지 않은 경우에 c를 String 문자열에 더한다.
               반환한다.
               
        String answer = "";       
        for(char c:my_string.toCharArray()) {
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                answer += String.valueOf(c);
        }
        return answer;
        */
        
        // 방법 2
        // replaceAll() 을 사용해서 a i e o u가 들어가면 없앤다.
        // 특이점은 방법1은 &&이었고 여기는 |을 사용한다는 점!
        // replaceAll()에 익숙해지자!
        return my_string.replaceAll("a|e|i|o|u", "");
    }
}