//2207 ���ϴ�
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

	cout << "������ ���" << endl;
	for (auto& e : v) {
		cout << e << endl;
		tot += e;
	}

	cout << "�� : "<<tot << endl;
	cout << "���" << tot/v.size()<<endl;
}