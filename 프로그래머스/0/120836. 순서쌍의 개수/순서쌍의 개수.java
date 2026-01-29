import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> factor = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                factor.add(i);
            }
        }
        
        answer = factor.size();
        
        return answer;
    }
    
}