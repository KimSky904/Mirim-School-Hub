#include<iostream>
using namespace std;
int main(void) {
	int A;
	cin >> A; //55
	
	int sum = 0;
	int count = 0;
	int bi=0;
	if (A < 10) sum = A;
	else sum = (A / 10) + (A % 10); //10


	while (true) {
		if (count == 0) {
			if (sum < 10)
				bi = (A % 10) * 10 + sum;
			else
				bi = (A % 10) * 10;  //50
		}//
		else bi = (bi % 10) * 10 + (sum%10); // 05
		count++;

		if (bi == A) break;
		sum = (bi/10)+(bi%10); //5
		
	}
	cout << count;
}