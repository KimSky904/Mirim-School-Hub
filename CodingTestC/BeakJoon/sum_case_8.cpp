#include<iostream>
using namespace std;
int main(void) {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	int A, B;
	int N;
	cin >> N;

	for (int i = 1; i <= N; i++) {
		cin >> A >> B;
		cout << "Case #" << i << ": " << A<<" + "<<B<<" = "<< A+B << "\n";
	}


}