#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;


void show(const int& item) {
	cout << item << "   ";
}
vector<int> lotto(int range, int sel) {
	vector<int> v;
	for (int j = 1; j <= range; j++) {
		v.push_back(j);
	}
	random_shuffle(v.begin(), v.end());
	v.resize(sel);
	return v;
}
int main() {
	srand((unsigned)time(NULL));

	vector<int> v;
	v = lotto(30, 5);
	for_each(v.begin(), v.end(), show);

	return 0;
}