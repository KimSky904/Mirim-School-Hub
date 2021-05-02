#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int* solution(char* shirt_size[], int shirt_size_len) {
	int* answer=(int*)malloc(sizeof(int)*6);
	int arr[6];
	answer = arr;
	for (int i = 0; i < shirt_size_len; i++) {
		if (shirt_size[i] == "XS") arr[0]++;
		else if (shirt_size[i] == "S") arr[1]++;
		else if (shirt_size[i] == "M") arr[2]++;
		else if (shirt_size[i] == "L") arr[3]++;
		else if (shirt_size[i] == "XL") arr[4]++;
		else if (shirt_size[i] == "XXL") arr[5]++;
	}
	free;
	return answer;
}
int main() {
	char* shirt_size[] = { "XS", "S", "L", "L", "XL", "S" };
	int shirt_size_len = 6;
	int* ret = solution(shirt_size, shirt_size_len);

	printf("solution 함수의 반환 값은 {");
	for (int i = 0; i < 6; i++) {
		if (i != 0) printf(", ");
		printf("%d", ret[i]);
	}
	printf("} 입니다.\n");
}