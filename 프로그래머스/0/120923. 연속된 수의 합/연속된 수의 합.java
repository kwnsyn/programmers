class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = 0;
        int x = 0;
        
        for(int i=0; i<num; i++) {
            a+=i;
        }
        
        x = (total-a) / num;
        
        for(int j=0; j<num; j++) {
            answer[j] = x+j;
        }
        
        return answer;
    }
}