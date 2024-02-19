class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int j=0;j<prices.length;j++){
            for(int i=j+1;i<prices.length;i++){
                answer[j]++;
                if(prices[i]<prices[j]) {
                    break;
                }
            } 
        }
        
        return answer;
    }
}
