import java.util.Stack;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //stack
        Stack<Integer> stack = new Stack<>();
        //할당
        for(int i=priorities.length-1;i>=0;i--){
            stack.push(priorities[i]);
        }
        int loc = 0;

        //프린트 목록 
        while(!stack.empty()){
            //인쇄 대기목록의 가장 앞에있는 문서
            int temp = stack.peek();
            //중요도 확인
            boolean flag = false;
            for(int i=0;i<priorities.length-1;i++){
                //중요도가 더 높은 문서가 존재하면
                if(stack.elementAt(i)>temp) {
                    flag = true;
                    break;
                }
            }
            //중요도 높은문서가 존재했을 경우
            if(flag) {
                //원하는 인쇄물일 경우 확인
                if(loc==location) return answer;
                else{
                    stack.pop();
                    answer++;
                }
            } 
            //현재 문서가 가장 높은 중요도일 경우
            //스택에서 꺼내와 뒤에 넣기
            else {
                int poped = stack.pop();
                stack.push(poped);
            }
            loc++;
        }
        
        
        return answer;
    }
}
