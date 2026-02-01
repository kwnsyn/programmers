class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorial = 1;
        
        while(factorial<n) {
            answer++;
            factorial *= answer;
            
            if(factorial > n) {
                answer--;
                break;
            }
        }
        
        return answer;
    }
}