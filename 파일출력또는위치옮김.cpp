#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
	ofstream output("output.txt");
	int n, file_len;
	output.seekp(0, ios::end);
	file_len = output.tellp();

	while (1) {
		cout << "���Ͽ� ������ ����Ϸ��� 1, ��ġ�� �ű���� 2," << endl;
		cout << "�����Ϸ��� �� �� ���� �Է��ϼ���. : ";
		cin >> n;
		if (n == 1) {
			string word;
			cin >> word;
			output << word;
			int temp = output.tellp();
			output.seekp(0, ios::end);
			if (file_len < output.tellp()) file_len = output.tellp();
			output.seekp(temp);
		}
		else if (n == 2) {
			int m;
			cin >> m;
			if (m > file_len || m < 0) cout << "�߸��� ��ġ�Դϴ�." << endl;
			else output.seekp(m);
		}
		else break;
	}

	output.close();
	return 0;
}