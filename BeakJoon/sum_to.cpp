#include<iostream>
using namespace std;
int main(void) {
	int A;
	cin >> A;

	int result=0;
	for (int i = 1; i <= A; i++) {
		result += i;
	}
	cout << result;
}