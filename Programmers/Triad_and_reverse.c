#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>
int solution(int n) {
    int answer = 0;
    int arr[1000];
    int count = 0;
    int index = 0;

    while (n) {
        arr[count++] = n % 3;
        printf("%d  ", n % 3);
        n /= 3;
    }

    for (int i = count - 1; i >= 0; i--) {
        answer += arr[i] * pow(3, index++);
    }

    return answer;
}