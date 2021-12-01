#include<iostream>
#include<vector>
using namespace std;

int main() {
	vector<int> v;
	v.push_back(10);
	v.push_back(20);
	v.push_back(30);
	v.push_back(40);
	v.assign(2, 2);

	//for (auto& e : v) {
	//	cout << e << endl;
	//}

	//vector<int>::iterator it;
	//for (it = v.begin(); it != v.end(); it++) {
	//	cout << *it << endl;
	//}

	cout << v.at(0) << endl;


	return 0;
}