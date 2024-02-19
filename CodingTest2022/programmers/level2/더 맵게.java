import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //최소힙 생성, 초기화
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++){
            minHeap.add(scoville[i]);
        }
        //K
        while(minHeap.peek()<K){
            answer++;
            //만들 수 없을 경우
            if(minHeap.size()<2) return -1;
            //음식 섞어 최소힙에 추가
            int mixed = minHeap.poll() + minHeap.poll()*2;
            minHeap.add(mixed);
        }
        
        return answer;
    }   
}
