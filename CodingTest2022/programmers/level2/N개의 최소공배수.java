class Solution {
   int solution(int arr[]) {
    int answer = 0;
    int max_num = arr[0];
    
    //가장 큰 수를 찾는 for
    for(int i=0;i<arr.length;i++){
        if(max_num<arr[i]) max_num = arr[i];
    }
    
    //모든 배열의 값이 가장 큰 수의 약수인지 판별하는 for
    for(int i=1;;i++){
        boolean flag = true;
        answer = max_num*i;
        for(int j=0;j<arr.length;j++){
            if(answer%arr[j]!=0){
                flag = false;
                break;
            }
        }
        if(flag==true)  return answer;
    }
}
}
