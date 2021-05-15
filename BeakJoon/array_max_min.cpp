#include<iostream>
using namespace std;
int main(void) {
	int A=0;
	cin >> A;
	int input;
	int max = -1000001, min = 1000001;
	for (int i = 0; i < A; i++) {
		cin >> input;
		if (input > max) max = input;
		if (input < min) min = input;
	}
	cout << min << " " << max << endl;

}