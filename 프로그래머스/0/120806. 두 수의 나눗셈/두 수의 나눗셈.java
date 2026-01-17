class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean bool = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
        
        if(bool) {
            answer = multiAndDivision(num1, num2);
        }
        
        return answer;
    }
    
    public int multiAndDivision(int num1, int num2) {
        double resultD = (double)num1 / (double)num2;
        
        int result =(int) (resultD * 1000);
        
        return result;
    }
}