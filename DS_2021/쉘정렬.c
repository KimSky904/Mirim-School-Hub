#include<stdio.h>
void ShellSort(int a[],int n) {
	int i, j, t;
	int temp;
	for (t = n / 2; t >= 1; t /= 2) {
		for (i = t; i < n; i++) {
			temp = a[i];
			for (j = i - t; j >= 0; j -= t) {
				if (temp < a[j]) a[j + t] = a[j];
				else break;
			}
			a[j + t] = temp;
		}
	}
}
int main() {
	int a[] = { 17,8,20,11,5,12,15,7 };
	int i, n = sizeof(a) / sizeof(int);

	printf("���� �� : ");
	for (i = 0; i < n; i++) printf("%d  ", a[i]);
	ShellSort(a, n);
	printf("\n�� ���� �� : ");
	for (i = 0; i < n; i++) printf("%d  ", a[i]);
	return 0;
}