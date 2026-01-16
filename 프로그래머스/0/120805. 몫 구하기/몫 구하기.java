class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean num1Val = num1 > 0 ? num1 <= 100 ? true : false : false;
        boolean num2Val = num2 > 0 ? num2 <= 100 ? true : false : false;
        
        if(num1Val && num2Val) {
            answer = division(num1, num2);
        }
        
        
        return answer;
    }
    
    public int division(int num1, int num2) {
        return num1 / num2;
    }
}