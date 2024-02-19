
#include <iostream>
#include <string>

using namespace std;

int main() {

	char c;
	int n;
	string str;

	cout << "단어나 수를 입력하세요: ";
	c = cin.peek();
	if (c >= '0' && c <= '9') {
		cin >> n;
		cout << "수를 입력하였습니다: " << n << endl;
	}
	else {
		cin >> str;
		cout << "단어를 입력하였습니다: " << str << endl;
	}

	return 0;
}