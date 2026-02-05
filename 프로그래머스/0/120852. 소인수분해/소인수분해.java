import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();
        int count = 0;
        
        for(int i=2; i<=n; i++) {
            count = 0;
            if(n%i == 0) {
                for(int j=1; j<=i; j++) {
                    if(i%j == 0) {
                        count++;
                    }
                }
                
                if(count == 2) {
                    arrList.add(i);
                }
            }
        }
        
        answer = arrList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}