class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double num = 1;
        double deno = 1;
        if(balls == share) {
            answer = 1;
        }else {
            for(int i=balls; i>share; i--) {
                num *= i;
            }
            for(int j=1; j<=(balls-share); j++) {
                deno *= j;
            }
            
            answer = (int) (num / deno);
        }        
        
        return answer;
    }
}