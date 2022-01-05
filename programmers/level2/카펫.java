class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        //yellow가 만들어지는 경우의 수
        for(int i=1;;i++)
            for(int j=1;j*i<=yellow;j++)
                if(i*j==yellow) {
                    //brown 개수 체크
                    if((i+2)*(j+2)-yellow==brown){
                        answer[0] = j+2;
                        answer[1] = i+2;
                        return answer;
                    }
                        
                }
    }
}
