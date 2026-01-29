import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortArr = emergency.clone();
        Arrays.sort(sortArr);
        
        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<sortArr.length; j++) {
                if(emergency[i] == sortArr[j]) {
                    answer[i] = emergency.length - j;
                }
            }
        }
        return answer;
    }
}