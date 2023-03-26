// StringBuilder의 append(), reverse() 사용!
// String의 .valueOf(n).split(""); 사용!
import java.util.*;

class Solution {
    public long solution(long n) {
        String arr[] = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(String a:arr) {
            sb.append(a);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}

// -

// import java.util.*;

// class Solution {
//     public long solution(long n) {
//         long answer = 0;
//         String temp = "";

//         String str = String.valueOf(n);
//         String[] arr = new String[str.length()];

//         for (int i = 0; i < str.length(); i++) {
//             arr[i] = String.valueOf(str.charAt(i));
//         }

//         Arrays.sort(arr, Collections.reverseOrder());

//         for(String a:arr) {
//             temp += a;
//         }

//         answer = Long.parseLong(temp);
//         return answer;
//     }
// }