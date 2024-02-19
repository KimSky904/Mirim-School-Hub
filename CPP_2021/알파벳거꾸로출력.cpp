#include<iostream>
#include<fstream>
using namespace std;
//���ĺ��� �Ųٷ� ����ϱ�
//��������� �� ��� ���� ����� ������ ����
//8�� line�� �߰��Ͽ� fp�� end�� ���� �� tellg�ؾ���
void reverseReadFile(ifstream& fin) {
	fin.seekg(0, ios::end);
	int length = fin.tellg();
	fin.seekg(0, ios::end);
	while (length > 0) {
		fin.seekg(--length, ios::beg);
		cout << (char)fin.get() << " ";
	}
}

int main() {
	ifstream input("input.txt"); //abcdefghijklmnopqrstuvwxyz
	if (input.fail()) {
		cout << "������ ���� �� �����߽��ϴ�." << endl;
		return 1;
	}

	reverseReadFile(input);
	return 0;
}