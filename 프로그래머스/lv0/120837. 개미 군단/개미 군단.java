class Solution {
    public int solution(int hp) {
        int ant = 0;
        ant += hp/5;
        hp = hp%5;
        
        ant += (hp/3 + hp%3);
 
        return ant;
    }
}