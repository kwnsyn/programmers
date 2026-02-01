class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = sortArr(numbers);
        answer = arr[0] * arr[1];
        
        return answer;
    }
    
    public int[] sortArr(int[] arr) {
        int temp = 0;
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                // 내림차순 정렬
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}