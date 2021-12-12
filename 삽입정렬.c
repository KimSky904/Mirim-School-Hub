#include<stdio.h>
void InsertionSort(int a[], int n) {
	int i, j, key;
	for (i = 1; i < n; i++) {
		key = a[i];
		for (j = i - 1; j >= 0; j--) { 
			if (key >= a[j]) break;
			a[j + 1] = a[j];
		}
		a[j + 1] = key;
	}
}
int main() {
	int a[] = { 10,5,7,12,9,16,1,3 };
	int i, n = sizeof(a) / sizeof(int);

	printf("정렬 전 : ");
	for (i = 0; i < n; i++) printf("%d  ", a[i]);
	InsertionSort(a, n);
	printf("\n정렬 후 : ");
	for (i = 0; i < n; i++) printf("%d  ", a[i]);
}