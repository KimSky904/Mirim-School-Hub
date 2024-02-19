#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int solution(int height[][4], int height_len) {
	int count = 0;
	for (int i = 0; i < height_len; i++) {
		for (int j = 0; j < height_len; j++) {
			if (height[i][j] < height[i][j - 1] && height[i][j] < height[i + 1][j] && height[i][j] < height[i][j + 1] && height[i][j] < height[i - 1][j]) {
				count++;
			}
		}
	}
	return count;
}
int main() {
	int height[4][4] = { {3, 6, 2, 8}, {7, 3, 4, 2}, {8, 6, 7, 3}, {5, 3, 2, 9} };
	int height_len = 4;
	int ret = solution(height, height_len = 4);

	printf("solution 함수의 반환 값은 %d 입니다.\n", ret);
}