#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int n) {
    // ������ ���� �޸𸮸� ���� �Ҵ����ּ���.
    char* answer = (char*)malloc(2 * sizeof(char) * n + 1);

    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) answer[i] = "��";
        else answer[i] = "��";
    }

    return answer;
}