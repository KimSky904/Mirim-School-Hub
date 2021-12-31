package programmers_Lv2;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case 1
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		print(solution(arr1,arr2));
		//case 2
		int[][] arr3 = {{2,3,2},{4,2,4},{3,1,4}};
		int[][] arr4 = {{5,4,3},{2,4,1},{3,1,1}};
		print(solution(arr3,arr4));
	}
	public static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        // (i,j) = (i,k)*(k,j)
        for(int i=0;i<arr1.length;i++){
            for(int k=0;k<arr1[0].length;k++){
                for(int j=0;j<arr2[0].length;j++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}
