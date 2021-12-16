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
		cout << "파일에 내용을 출력하려면 1, 위치를 옮기려면 2," << endl;
		cout << "종료하려면 그 외 수를 입력하세요. : ";
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
			if (m > file_len || m < 0) cout << "잘못된 위치입니다." << endl;
			else output.seekp(m);
		}
		else break;
	}

	output.close();
	return 0;
}