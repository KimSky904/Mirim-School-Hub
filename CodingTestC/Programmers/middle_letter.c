#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


// �Ķ���ͷ� �־����� ���ڿ��� const�� �־����ϴ�. �����Ϸ��� ���ڿ��� �����ؼ� ����ϼ���.
char* solution(const char* s) {
    // return ���� malloc �� ���� �Ҵ��� ������ּ���. �Ҵ� ���̴� ��Ȳ�� �°� �������ּ���.
    char* answer = (char*)malloc(sizeof(char) * 2);
    int size = strlen(s);

    if (size % 2 == 0) {
        answer[0] = s[size / 2 - 1];
        answer[1] = s[size / 2];
        answer[2] = NULL;
    }
    else {
        answer[0] = s[size / 2];
        answer[1] = NULL;
    }
    return answer;
}