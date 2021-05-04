#include<iostream>
using namespace std;
int main(void) {

	double A, B;

	cin >> A >> B;

	cout << fixed;
	cout.precision(15);
	cout << A / B << endl;
	cout.unsetf(ios::fixed);

}