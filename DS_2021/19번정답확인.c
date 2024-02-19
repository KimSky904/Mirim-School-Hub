#include<stdio.h>
int main(void) {
	int a[] = { 15,7,33,10,6,24,20,12 };
	int n = sizeof(a) / sizeof(int);
	int i, j, key, step = 1;

	for (i = 1; i < n; i++) {
		key = a[i];
		for (j = i - 1; j >= 0; j--) {
			if (a[j] > key) a[j + 1] = a[j];
			else break;
		}
		a[j + 1] = key;
		if (step == 3) {
			for (int i = 0; i < n; i++) printf("%4d", a[i]);
		}
		step++;
	}
	return 0;
}