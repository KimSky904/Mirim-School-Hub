#include<iostream>
#include<fstream>
using namespace std;

int main() {
	//깨지면 binary파일로 열고, 복사하기
	ifstream src("copyFileProgram.cpp", ios::binary);	//입력(g)
	ofstream tar("target.txt", ios::binary);		//출력(p)

	char szBuf[1024];	//src에 넣은 글씨가 들어갈 방	(1024 = 1KB)
	int nRead;
	for (;;) {
		src.read(szBuf, 1024);	//1024바이트 읽음
		nRead = src.gcount();	//지금까지 읽은 바이트 수(1024 or 그보다 조금 작은 수)
		if (nRead == 0) {
			break;
		}
		tar.write(szBuf, nRead);
	}

	src.close();
	tar.close();
	return 0;
}