//2207 ±Ë«œ¥√
#include<iostream>
using namespace std;
template<typename T>
T totalArray(T arr[], int len) {
	T sum = 0;
	for (int i = 0; i < len; i++) {
		sum += arr[i];
	}
	return sum;
}
int main() {
	int a[] = {1,2,3};

	cout << totalArray<int>(a, 3) << endl;
	char b[] = {'A','B','C'};
	cout << totalArray(b, 3) << endl;
}