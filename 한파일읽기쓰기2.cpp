//11.30 �����ð� �ϳ��� ���Ϸ� write�� read
#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include<fstream>
using namespace std;
int main() {
	int nNumber;
	char szName[20];

	//in and out
	fstream file("data.txt");
	for (int i = 0; i < 10; i++) {
		nNumber = i + 1;
		sprintf(szName, "�̸�_%d", nNumber); //%d�� nNumber ����, ���԰���� szName�� ����
		file << nNumber << szName << endl;
	}
	file.seekg(0, ios::beg);
	for (int i = 0; i < 10; i++) {
		file >> nNumber;
		file >> szName;
		cout << nNumber << "  " << szName << endl;
	}
	file.close();

	return 0;
}