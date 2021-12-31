package programmers_Lv2;

public class nextBiggerNumber {

	public static void main(String[] args) {
		// case 1
		System.out.println(solution(78));
	}
	public static int solution(int n) {
        int answer = 0;
        int nCount = binaryCount(n);
       
        for(n++ ; ; ++n){
            int count = binaryCount(n);
            if(count == nCount) return n;
        }
    }
    public static int binaryCount(int n){
        int oneCount = 0;
        String binary = Integer.toBinaryString(n);
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1') oneCount++;
        }
        return oneCount;
    }
}
