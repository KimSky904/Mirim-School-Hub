#include<iostream>
#include<fstream>
using namespace std;
//알파벳을 거꾸로 출력하기
//교과서대로 할 경우 옳은 결과가 나오지 않음
//8번 line을 추가하여 fp를 end로 맞춘 후 tellg해야함
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
		cout << "파일을 여는 데 실패했습니다." << endl;
		return 1;
	}

	reverseReadFile(input);
	return 0;
}