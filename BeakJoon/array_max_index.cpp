#include<iostream>
using namespace std;
int main(void) {
	int arr[9];
	int max = 0,max_index=-1;
	for (int i = 0; i < 9; i++) {
		cin >> arr[i];
		if (arr[i] > max) {
			max = arr[i];
			max_index = i+1;
		}
	}
	cout << max << endl;
	cout << max_index << endl;

}