//11.30 �����ð� �ϳ��� ���Ϸ� write�� read
#define _CRT_SECURE_NO_WARNINGS
#include<iostream>
#include<fstream>
using namespace std;
int main() {
	int nNumber;
	char szName[20];

	//out
	ofstream outFile("data.txt");
	for (int i = 0; i < 10; i++) {
		nNumber = i + 1;
		sprintf(szName, "�̸�_%d", nNumber); //%d�� nNumber ����, ���԰���� szName�� ����
		outFile << nNumber << szName << endl;
	}
	outFile.close();

	//in
	ifstream inFile("data.txt");
	for (int i = 0; i < 10; i++) {
		inFile >> nNumber;
		inFile >> szName;
		cout << nNumber << "  " << szName << endl;
	}
	inFile.close();

	return 0;
}