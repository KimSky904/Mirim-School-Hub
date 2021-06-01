#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// nums_len은 배열 nums의 길이입니다.
int solution(int nums[], size_t nums_len) {
    int answer = -1;
    //int arrSize = (nums_len * (nums_len - 1) * (nums_len - 2)) / ((nums_len - 1) * (nums_len - 2));
    //int* addNum = (int*)malloc(sizeof(int) * nums_len);
    int addNum = 0;
    int count = 0;
    int index = 0;
    int cnt = 0;

    for (int i = 0; i < nums_len; i++) {
        for (int j = i + 1; j < nums_len; j++) {
            for (int z = j + 1; z < nums_len; z++, index++) {
                addNum = nums[i] + nums[j] + nums[z];
                printf("%d  ", addNum);
                for (int index = 2; index < addNum; index++) {
                    if (addNum % index == 0) {
                        count = 1;
                        break;
                    }
                }
                if (count != 1) cnt++;
                
            }
        }
    }
   

    answer = cnt;
    return answer;
}
int main(void) {
    int nums[] = { 1,2,3,4 };
    
    printf("%d", solution(nums, 4));
}