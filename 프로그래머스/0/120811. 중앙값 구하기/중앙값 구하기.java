class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int mid = (array.length -1) / 2;
        
        int[] sortArr = sort(array);
        
        answer = sortArr[mid];
        
        return answer;
    }
    
    public int[] sort(int[] arr) {
        int temp = 0;
        
        for(int i=0; i<arr.length - 1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
            System.out.print(i + ": ");
            for(int a=0; a<arr.length; a++) {
                System.out.print(arr[a] + " ");
            }
            System.out.println("");
        }
        
        return arr;
    }
}