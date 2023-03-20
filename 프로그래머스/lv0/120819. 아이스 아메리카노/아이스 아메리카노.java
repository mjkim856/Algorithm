class Solution {
    public int[] solution(int money) {
        int price = 5500;
        int count = money/price;
        int balance = money%price;
        int[] answer = {count, balance};
        return answer;
    }
}
