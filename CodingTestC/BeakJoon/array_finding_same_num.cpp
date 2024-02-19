#include<iostream>
using namespace std;
int main(void) {
	int arr[10] = { 0, };
	int comp[42] = { 0, };
	int count = 0;
	for (int i = 0; i < 10; i++) {
		cin >> arr[i];
		comp[arr[i] %= 42]++;
	}
	for (int i = 0; i < 42; i++) {
		if (comp[i] != 0) count++;
	}
	cout << count;
}