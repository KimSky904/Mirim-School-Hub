#include<iostream>
using namespace std;
int main(void) {
	cin.tie(NULL);
	cin.sync_with_stdio(false);
	int N;
	cin >> N;
	for (int i = 1; i <= N; i++) {
		for (int j = N; j > i; j--) {
			cout << " ";
		}
		for (int j = 0; j < i; j++) {
			cout << "*";
		}
		cout << "\n";
	}
}