
#include <iostream>
#include <string>

using namespace std;

int main() {

	char c;
	int n;
	string str;

	cout << "�ܾ ���� �Է��ϼ���: ";
	c = cin.peek();
	if (c >= '0' && c <= '9') {
		cin >> n;
		cout << "���� �Է��Ͽ����ϴ�: " << n << endl;
	}
	else {
		cin >> str;
		cout << "�ܾ �Է��Ͽ����ϴ�: " << str << endl;
	}

	return 0;
}