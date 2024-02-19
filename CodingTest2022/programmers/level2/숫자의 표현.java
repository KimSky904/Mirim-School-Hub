package programmers_Lv2;

public class ExpressionOfNumber {

	public static void main(String[] args) {
		//case 1
		int number = 15;
		System.out.println(solution(number));
	}
	public static int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            int number=0;
            for(int j=i;j<=n;j++){
                number+=j;
                if(number==n) {
                    answer++;
                    break;
                }
                if(number>n) break;
            }
        }
        
        return answer;
    }
}
