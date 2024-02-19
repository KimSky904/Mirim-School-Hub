#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int a, int b) {
    const char* day[] = { "FRI","SAT","SUN","MON","TUE","WED","THU" };
    // 리턴할 값은 메모리를 동적 할당해주세요.
    char* answer = (char*)malloc(sizeof(char) * 3);
    int day_num[12] = { 31,29,31,30,31,30,31,31,30,31,30,31 };
    int count = 0;

    for (int i = 0; i < a - 1; i++) {
        count += day_num[i];
    }
    count += b - 1;

    answer = day[count % 7];
    return answer;
}