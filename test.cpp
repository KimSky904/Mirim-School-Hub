#include<iostream>
#include<fstream>
using namespace std;
int main() {
	const char* file = "sample.txt";
	ifstream fin(file);
	if (!fin) {
		cout << file << "���� ����" << endl;
		exit(1);
	}
	fin.seekg(0, ios::end);
	cout << file << "�� ũ��� " << fin.tellg() << endl; //���� �� -> ������ ��ü ���� ���� �� �� ����
	fin.close();


	return 0;
}