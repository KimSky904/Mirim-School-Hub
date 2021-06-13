#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(int x) {
    bool answer = false;

    int copy_x = x;
    int sum = 0;

    while (copy_x > 0) {
        sum += copy_x % 10;
        copy_x /= 10;
    }

    if (x % sum == 0) answer = true;

    return answer;
}