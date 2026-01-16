class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String i : babbling) {
            i = i.replace("aya", "1");
            i = i.replace("ye", "1");
            i = i.replace("woo", "1");
            i = i.replace("ma", "1");
            
            i = i.replaceAll("1", "");
            
            if(i.equals("")) {
                answer++;
            }
            
        }
        
        return answer;
    }
}