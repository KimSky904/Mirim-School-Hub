//11.30 수업시간 하나의 파일로 write과 read
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
		sprintf(szName, "이름_%d", nNumber); //%d에 nNumber 대입, 대입결과를 szName에 저장
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