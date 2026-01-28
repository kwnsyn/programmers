import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] ageStr = Integer.toString(age).split("");
        
        for(int i=0; i<ageStr.length; i++) {
            answer += letter[Integer.parseInt(ageStr[i])];
        }
        
        
        return answer;
    }
}