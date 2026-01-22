class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        boolean bool = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
        
        if(bool) {
            answer = remainder(num1, num2);
        }
        return answer;
    }
    
    public int remainder(int num1, int num2) {
        return num1 % num2;
    }
}