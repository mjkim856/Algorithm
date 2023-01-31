// 방법 1
// length, arrSum, answer를 모두 변수 선언 한 뒤 사용했다.
// 알고리즘 문제에서 굳이 하나하나 변수 선언하고 사용할 필요는 없겠다 ... 라고 생각했지만. 그래도!
// 이번에도 형변환 때문에 애먹었다. 
// int/int는 이미 int라 double로 변환할 수 없으니, 애초에 값 자체를 double로 형변환하여 사용하자.
class Solution {
    public double solution(int[] numbers) {
        int length = numbers.length;
        int arrSum = 0;
        for(int i = 0; i < length; i++) {
            arrSum += numbers[i];
        }

        double answer = (double)arrSum / length;
        return answer;
    }
}

// 방법 2
// 처음부터 arrSum을 double로 선언하면 뒤에서 형변환 할 필요가 없다.
// case 4에서 방법 1보다 0.02ms 빨랐다!
class Solution {
    public double solution(int[] numbers) {
        double arrSum = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            arrSum += numbers[i];
        }
        
        double answer = arrSum / numbers.length;
        return answer;
    }
}

// 방법 3
// 함수형 방식을 사용했다.
// 그런데 시간은 위 방식보다 훨씬 오래 걸렸다. 왜지? 굳이 이 방식을 사용한 데에는 이유가 있을 텐데?
// 1. java.util.Arrays를 import 하고 
// 2. stream() 중 집계함수인 avarage를 사용했으며
// 3. 만약 값이 없다면 0을 기본으로 지정했다.
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers)
            .average()
            .orElse(0);
    }
}



