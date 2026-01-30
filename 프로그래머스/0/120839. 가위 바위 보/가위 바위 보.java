class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        
        for(String str : arr) {
            switch(str) {
                case "0": str = "5"; break;
                case "2": str = "0"; break;
                case "5": str = "2"; break;
            }
            
            answer += str;
        }
                
        return answer;
    }
}