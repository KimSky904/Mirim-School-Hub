#include<iostream>

using namespace std;
int main(void) {
	cin.tie(NULL);
	cin.sync_with_stdio(false);

	int Testcase;
	cin >> Testcase;


	for (int i = 0; i < Testcase; i++) {
		int A,B;
		cin >> A>>B;
		cout << A + B << "\n";
	}

}