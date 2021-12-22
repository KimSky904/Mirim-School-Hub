package programmers_Lv2;

public class Fibonacci {

	public static void main(String[] args) {
		//case 1
				System.out.println(solution(3));
				//case 2
				System.out.println(solution(5));
	}
	public static int solution(int n) {

        
        int fibo_left = 0;
        int fibo_right = 1;
        int answer = 0;
        if(n<=1) answer = n%1234567;
        else 
            for(int i=2;i<=n;i++){
                answer = (fibo_left+fibo_right)%1234567;
                fibo_left = fibo_right;
                fibo_right = answer;
            }


        System.out.println(n+"    "+answer);
        return answer;
    }

}
