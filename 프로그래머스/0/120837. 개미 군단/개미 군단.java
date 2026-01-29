class Solution {
    public int solution(int hp) {
        int answer = 0;
        int temp = 0;
        
        
        int gen = hp / 5;
        int soldier = (hp % 5) / 3;
        int worker = (hp % 5) % 3;
        
        answer = gen + soldier + worker;
        
        return answer;
    }
}