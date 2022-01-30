import java.util.*;

class Main {
    public int solution(int[] arr) {
        
        int answer = 0;
		int current = arr[0];
		int count = 1;
		
		for(int i=1;i<arr.length;i++){
			if(current<arr[i]){
				count++;
			} 
			else if(count>answer){
				answer = count;
				count = 1;
			} 
			current = arr[i];
		}
		
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

