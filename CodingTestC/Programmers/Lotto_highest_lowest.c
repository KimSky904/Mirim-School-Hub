#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// lottos_len�� �迭 lottos�� �����Դϴ�.
// win_nums_len�� �迭 win_nums�� �����Դϴ�.
int* solution(int lottos[], size_t lottos_len, int win_nums[], size_t win_nums_len) {
    // return ���� malloc �� ���� �Ҵ��� ������ּ���. �Ҵ� ���̴� ��Ȳ�� �°� �������ּ���.
    int* answer = (int*)malloc(sizeof(int) * 2);
    int zero_count = 0, lotto_count = 0;

    for (int i = 0; i < lottos_len; i++) {
        if (lottos[i] == 0) zero_count++;
        for (int j = 0; j < lottos_len; j++) {
            if (lottos[i] == win_nums[j]) lotto_count++;
        }
    }

    answer[0] = 7 - (lotto_count + zero_count);
    answer[1] = 7 - lotto_count;

    //���� 1 : ��Ʋ���� 0��������?
    if (lotto_count == 0 && zero_count == 0) {
        answer[0] = 6; answer[1] = 6;
    }
    //���� 2 : ��� ���� 0�϶�?
    if (zero_count == 6) answer[1]--;


    return answer;
}