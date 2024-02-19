#include<iostream>
using namespace std;

template<class T>
T sum(T x, T y) {
	T z = x + y;
	return z;
}
int main() {
	int a1 = 10, b1 = 20;
	string a2 = "Mirim", b2 = "Meister";
	//char a3[] = "Hi",b3[] = "Hello";
	double a3 = 1.23, b3 = 4.56;
	cout << sum(a1, b1)<<endl;
	cout << sum(a2, b2) << endl;
	cout << sum(a3, b3) << endl;
}