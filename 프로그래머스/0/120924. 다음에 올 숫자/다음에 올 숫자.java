class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int distinction = (common[2]-common[1]) - (common[1]-common[0]);
        
        if(distinction == 0) {
            // 등차수열
            answer = arithmetic(common);
        }else {
            // 등비수열
            answer = geometric(common);
        }
        
        return answer;
    }
    
    // 등차수열일 경우
    public int arithmetic(int[] common) {
        int result = 0;
        int i = common[1] - common[0];
        
        return common[common.length-1] + i;
    }
    
    // 등비수열일 경우
    public int geometric(int[] common) {
        int result = 0;
        int i = common[1] / common[0];
        
        return common[common.length-1] * i;
    }
}