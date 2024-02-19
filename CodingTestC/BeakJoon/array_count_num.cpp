#include<iostream>
using namespace std;
int main(void) {
	int A, B, C;
	cin >> A >> B >> C;

	int res = A * B * C;
	int arr[10] = { 0, };	
	for (int i = 0; res>0 ; i++) {
		arr[res%10]++;
		res /= 10;
	}
	for (int i = 0; i < 10; i++) {
		cout << arr[i] << endl;
	}
}