import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int sum = sides[0] + sides[1];
        int longSide = sides[2];
        
        if(sum > longSide) {
            answer = 1;
        }else {
            answer = 2;
        }
        
        return answer;
    }
}