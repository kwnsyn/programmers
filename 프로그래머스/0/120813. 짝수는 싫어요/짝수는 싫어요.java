import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> oddList = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i+=2){
            oddList.add(i);
        }
        
        answer = oddList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}