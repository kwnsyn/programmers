import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        List<String> morse = new ArrayList<>(Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."));
        String[] letterArr = letter.split(" ");
        
        for(String str : letterArr) {
            int idx = morse.indexOf(str);
            char ch = (char)(idx+97);
            answer += ch;
        }
        
        
        
        
        return answer;
    }
}