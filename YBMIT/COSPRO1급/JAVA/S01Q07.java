package Set01;

class Q7{
    int solution(int[] prices){
        int INF = 1000000001;
        int tmp = INF;
        //최대 이익 저장
        int answer = -INF;
        for(int price : prices){
            if(tmp != INF)
                //tmp에 변동이 있고 이익이 기존보다 큰 경우
                // answer =  판 금액 - 산 금액
                answer = Math.max(answer, price-tmp);
            //더 싼 가격에 사기 위함
            tmp = Math.min(tmp, price);
        }
        return answer;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Q7 sol = new Q7();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");

        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
