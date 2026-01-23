class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] modeArr = new int[1000];
        int mode = 0;
        int max = 0;
        int modes = 0;
        
        for(int i=0; i<array.length; i++) {
            modeArr[array[i]]++;
        }
        
        // 최빈값 구하기
        for(int j=0; j<modeArr.length; j++) {
            if(modeArr[j] > max) {
                max = modeArr[j];
                mode = j;
                modes = 0;
            }else if (modeArr[j] == max) {
                modes++;
            }
        }
        
        if(modes != 0) {
            answer = -1;
        }else {
            answer = mode;
        }
        
        return answer;
    }
}