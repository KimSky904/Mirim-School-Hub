package Set01;

import java.util.*;

class Q5 {
    public int[] solution(int N, int[] votes) {
        //각 후보에 대한 득표 수 세기
        int voteCounter[] = new int[11];
        for (int i = 0; i < votes.length; i++) {
            voteCounter[votes[i]] += 1;
        }
        //가장 많은 표를 구함
        int maxVal = 0;
        //가장 많은 표(maxVal)를 받은 후보의 수
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (maxVal < voteCounter[i]) {
                maxVal = voteCounter[i];
                cnt = 1;
            }
            else if(maxVal == voteCounter[i]){
                cnt += 1;
            }
        }
        //최다득표한 후보의 수만큼 배열 생성 (return값)
        int answer[] = new int[cnt];
        //해당 후보의 번호를 answer에 저장
        for (int i = 1, idx = 0; i <= N; i++){
            if (voteCounter[i] == maxVal) {
                answer[idx] = i;
                idx += 1;
            }
        }
        return answer;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Q5 sol = new Q5();
        int N1 = 5;
        int[] votes1 = {1,5,4,3,2,5,2,5,5,4};
        int[] ret1 = sol.solution(N1, votes1);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret1) + " .");


        int N2 = 4;
        int[] votes2 = {1, 3, 2, 3, 2};
        int[] ret2 = sol.solution(N2, votes2);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret2) + " .");
    }
}
