#include<iostream>
using namespace std;
int main(void) {
	int A, B;
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	cin >> A >> B;

	while (A!=5) {

		cout << A + B << "\n";
		cin >> A >> B;
	}
}