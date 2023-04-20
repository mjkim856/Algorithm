class Solution {
    public int solution(int hp) {
        
        
        /*       
        방법 1. 순서대로 차근차근
            왜 hp%3을 더해주냐면, 어차피 1의 공격력이라 2면 개미 2마리 1이면 개미 1마리라 그렇다. 
        
        int ant = 0;
        ant += hp/5;
        hp = hp%5;
        ant += (hp/3 + hp%3);
        */
 
        // 방법 2. 냅다 때려박기   
        return hp/5 + hp%5/3 + hp%5%3;
    }
}