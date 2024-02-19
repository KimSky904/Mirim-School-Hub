//2207 ±Ë«œ¥√
#include<iostream>
#include<vector>
using namespace std;



int main() {
	vector<int> v;
	int input, tot = 0;
	double avg;

	for (int i = 0; i < 5; i++) {
		cin >> input;
		v.push_back(input);
	}

	cout << "µ•¿Ã≈Õ ∏Ò∑œ" << endl;
	for (auto& e : v) {
		cout << e << endl;
		tot += e;
	}

	cout << "«’ : "<<tot << endl;
	cout << "∆Ú±’" << tot/v.size()<<endl;
}