#include<iostream>
#include<fstream>
using namespace std;

int main() {
	//������ binary���Ϸ� ����, �����ϱ�
	ifstream src("copyFileProgram.cpp", ios::binary);	//�Է�(g)
	ofstream tar("target.txt", ios::binary);		//���(p)

	char szBuf[1024];	//src�� ���� �۾��� �� ��	(1024 = 1KB)
	int nRead;
	for (;;) {
		src.read(szBuf, 1024);	//1024����Ʈ ����
		nRead = src.gcount();	//���ݱ��� ���� ����Ʈ ��(1024 or �׺��� ���� ���� ��)
		if (nRead == 0) {
			break;
		}
		tar.write(szBuf, nRead);
	}

	src.close();
	tar.close();
	return 0;
}