#include<iostream>
#include<fstream>
using namespace std;
int main() {
	const char* file = "sample.txt";
	ifstream fin(file);
	if (!fin) {
		cout << file << "열기 오류" << endl;
		exit(1);
	}
	fin.seekg(0, ios::end);
	cout << file << "의 크기는 " << fin.tellg() << endl; //글자 수 -> 파일의 전체 글자 수를 셀 수 있음
	fin.close();


	return 0;
}