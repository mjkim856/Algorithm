// 방법 1
class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1/num2*1000;
        return (int)answer;
    }
}


// 방법 2
class Solution {
    public int solution(int num1, int num2) {
        return (int)(((double)num1/num2)*1000);
    }
}
