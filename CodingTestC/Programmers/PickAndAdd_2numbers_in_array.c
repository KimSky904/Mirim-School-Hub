#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len�� �迭 numbers�� �����Դϴ�.
int* solution(int numbers[], size_t numbers_len) {
    int* answer = (int*)malloc(sizeof(int) * numbers_len * (numbers_len - 1));
    int count = 0;

    for (int i = 0; i < numbers_len; i++) {
        for (int j = i + 1; j < numbers_len; j++) {
            int value = numbers[i] + numbers[j];
            bool same = false;
            for (int z = 0; z < count; z++) {
                if (answer[z] == value) same = true;
            }
            if (same == false)
                answer[count++] = value;
        }
    }


    //����
    for (int i = 0; i < count; i++) {
        for (int j = i + 1; j < count; j++) {
            int temp;
            if (answer[i] >= answer[j]) {
                temp = answer[i];
                answer[i] = answer[j];
                answer[j] = temp;
            }
        }
    }

    return answer;
}