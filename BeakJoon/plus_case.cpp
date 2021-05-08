#include<iostream>
using namespace std;
int main(void) {
	int A;
	cin >> A;

	for (int i = 0; i < A; i++) {
		int x,y = 0;
		cin >> x>>y;
		cout << x + y << endl;
	}
}