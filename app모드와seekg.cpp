#include<iostream>
#include<fstream>
using namespace std;
int main() {
	ifstream input("output.txt",ios::app); //abcdefghijklmnopqrstuvwxyz
	if (input.fail()) {
		cout << "파일을 여는 데 실패했습니다." << endl;
		return 1;
	}

	input.seekg(0, ios::end); //fp(file pointer)가 가장 마지막 위치로 이동
	cout << (char)input.get() << endl;
	//input.clear();
	input.seekg(-5, ios::cur); //fp(file pointer)가 현재 커서(마지막)로부터 5번 왼쪽으로 이동
	cout << (char)input.get() << endl;
	input.close();
	return 0;

	/*
	[13번 line을 제외하고 실행했을 경우 예상과 다르게 아무 문자도 출력되지 않는 문제 발생]
		get()에서
		cpp의 스트림은 endofbit라는 플래그가 있는데, 입출력함수를 통해 끝에 도달할 경우 더이상 입출력이 먹히지 않음
		+peek()함수는 입출력 함수가 아니기 때문에 위의 이슈가 발생하지 않음
	=> clear() 사용

	*/

}