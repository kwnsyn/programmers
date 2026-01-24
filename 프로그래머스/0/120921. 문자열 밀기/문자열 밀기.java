class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<A.length(); i++) {
            if(B.equals(A)) {
                break;
            }
            
            count++;
            A = pushString(A);
        }
        
        if(count == A.length()) {
            answer = -1;
        }else {
            answer = count;
        }
        
        return answer;
    }
    
    public String pushString(String str) {
        String result = "";
        String last = str.substring(str.length()-1);
        result = last + str.substring(0, str.length()-1);
        
        return result;
    }
}