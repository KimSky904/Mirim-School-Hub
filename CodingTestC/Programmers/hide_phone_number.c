#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// �Ķ���ͷ� �־����� ���ڿ��� const�� �־����ϴ�. �����Ϸ��� ���ڿ��� �����ؼ� ����ϼ���.
char* solution(const char* phone_number) {
    // return ���� malloc �� ���� �Ҵ��� ������ּ���. �Ҵ� ���̴� ��Ȳ�� �°� �������ּ���.
    char* answer = (char*)malloc(sizeof(char) * 20);
    int length = 0;

    answer = phone_number;
    for (int i = 0; phone_number[i] != NULL; i++) {
        length++;
    }
    for (int i = 0; i < length - 4; i++) {
        answer[i] = '*';
    }


    return answer;
}