class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = doubleArr(numbers[i]);
        }
        
        return answer;
    }
    
    public int doubleArr(int i) {
        return i * 2;
    }
}