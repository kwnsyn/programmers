class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[][] answer = new int[length/n][n];
        int count = 0;
        
        for(int i=0; i<length; i++) {
            if(i!=0 && i%n==0) {
                count++;
            }
            answer[count][i%n] = num_list[i];
            
        }
        
        return answer;
    }
}