class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = add(numer1, denom1, numer2, denom2);
        return answer;
    }
    
    public int[] add(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = (denom1 * denom2);
        
        int gcd = gcd(numer, denom);
        
        int[] result = new int[2];
        result[0] = numer / gcd;
        result[1] = denom / gcd;
        
        return result;
    }
    
    public int gcd(int numer, int denom) {
        int gcd = 1;
        int val = 0;
        
        if(numer > denom) {
            val = numer;
        }else if (numer < denom) {
            val = denom;
        }else if (numer == denom) {
            val = numer;
        }
        
        
        for(int i=2; i<=val; i++) {
            if(numer % i == 0 && denom % i == 0) {
                gcd = i;
            }
        }
        
        return gcd;
    }
}