class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int temp = Math.abs(array[0]-n);
        
        for(int i=0; i<array.length; i++) {
            if(Math.abs(array[i]-n) < temp) {
                temp = Math.abs(array[i]-n);
                answer = array[i];
            }else if(Math.abs(array[i]-n) == temp) {
                if(answer > array[i]) {
                    answer = array[i];
                }
            }
        }
        
        return answer;
    }
}