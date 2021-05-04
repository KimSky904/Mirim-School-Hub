#include<iostream>
using namespace std;
int main(void) {
	int A, B;
	cin >> A >> B;

	int num1, num2, num3;
	num1 = A * (B % 10);
	num2 = A * (B / 10 % 10);
	num3 = A * (B / 100);

	cout << num1 << endl;
	cout << num2 << endl;
	cout << num3 << endl;
	cout << num1+num2*10+num3*100 << endl;
}