import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        //탐욕법
        //limit-([i]+[j])의 절댓값과 i,j를 저장 후 계산값을 기준으로 정렬
        //people을 정렬하여 작은값+큰값이 limit보다 크면 큰값 out, 같거나 작으면 작큰값 out
        
        Arrays.sort(people);
        for(int i=0,j=people.length-1;j>=i;j--){
            //합이 limit보다 큰 경우
            if((people[i]+people[j])>limit) {
                answer++; //구출 횟수 ++
            }
            else {
                answer++; //구출 횟수 ++
                i++; 
            }
        }
        
        
        return answer;
    }
}
