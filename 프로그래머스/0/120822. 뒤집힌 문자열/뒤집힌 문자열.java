class Solution {
    public String solution(String my_string) {
        String answer = "";
        int strLeng = my_string.length();
        String[] strArr = my_string.split("");
        
        for(int i=strLeng-1; i>=0; i--) {
            answer += strArr[i];
        }
        
        return answer;
    }
}