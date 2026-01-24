class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = lcm(n) / 6;
        return answer;
    }
    
    public int lcm(int n) {
        int result = 0;
        for(int i = 1; i<=6*n; i++) {
            if(i % 6 == 0 && i % n == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}