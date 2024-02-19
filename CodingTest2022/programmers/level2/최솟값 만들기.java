package programmers_Lv2;

import java.util.Arrays;

public class MinValue {

	public static void main(String[] args) {
		//case 1
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		System.out.println(solution(a,b));
	}

	public static int solution(int []A, int []B)
    {
        int answer = 0;
        
        QuickSort(A,0,A.length-1);
        QuickSort(B,0,B.length-1);
        for(int i=0;i<A.length;i++){
            answer+=A[i]*B[B.length-i-1];
        }

        return answer;
    }
    public static void QuickSort(int[] arr,int start, int end) {
        int part=partition(arr,start,end);
        if(start<part-1) QuickSort(arr,start,part-1);
        if(end>part) QuickSort(arr,part,end);
    }
    public static int partition(int[] arr,int start,int end) {
        int pivot=arr[(start+end)/2];
        while(start<=end) {
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end) {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
