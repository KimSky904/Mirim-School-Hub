#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void show(const char& item) {
	cout << item << "   ";
}
vector<char> randomAlpha(int len) {
	vector<char> result;
	for (int i = 0; i < len; i++) {
		char alpha = (char)(rand() % 26 + 65); //65 ~ 90 - 97 ~ 122
		result.push_back(alpha);
	}
	random_shuffle(result.begin(), result.end());
	return result;
}

int main() {
	srand((unsigned)time(NULL));
	vector<char> v;
	v = randomAlpha(6);
	for_each(v.begin(), v.end(), show);

	return 0;
}