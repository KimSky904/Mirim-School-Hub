package Set01;

import java.util.*;

class Q4 {
    public int[] solution(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        while(arrA_idx < arrA_len && arrB_idx < arrB_len){
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
        while(arrA_idx<arrA_len)
            answer[answer_idx++] = arrA[arrA_idx++];

        while(arrB_idx<arrB_len)
            answer[answer_idx++] = arrB[arrB_idx++];

        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Q4 sol = new Q4();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.solution(arrA, arrB);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}
