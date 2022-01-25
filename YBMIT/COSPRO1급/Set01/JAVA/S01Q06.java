package Set01;

class Q6{
    //record를 이기는 결과 반환 (record : 가위, result : 바위)
    public int func(int record){
        if(record == 0) return 1;
        else if(record == 1) return 2;
        return 0;
    }
    public int solution(int[] recordA, int[] recordB){
        //A의 계단 위치
        int cnt = 0;
        //10번 반복 (5번 항목)
        for(int i = 0; i < recordA.length; i++){
            //비겼을 경우 제자리
            if(recordA[i] == recordB[i])
                continue;
            //이겼을 경우 +3칸
            else if(recordA[i] == func(recordB[i]))
                cnt = cnt + 3;
            //졌을 경우 -1칸
            else if(cnt!=0)
                cnt = cnt - 1;
            System.out.println(i+"번쨰 : "+cnt);
        }
        return cnt;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Q6 sol = new Q6();
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = sol.solution(recordA, recordB);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
