package programmers_Lv2;

public class MaxValue_MinValue {

	public static void main(String[] args) {
		//case 1
		String a = "1 2 3 4";
		System.out.println(solution(a));
	}

	public static String solution(String s) {
        String answer = "";
        
        //분할
        String[] splited = s.split(" ");
        int[] numbers = new int[splited.length];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = Integer.parseInt(splited[i]);
        }
        //정렬
        for(int i=0;i<numbers.length;i++){
            int min = i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]<numbers[min]) min = j;
            }
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
        answer = numbers[0]+" "+numbers[numbers.length-1];
        return answer;
    }
}
