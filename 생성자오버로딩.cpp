#include<iostream>
using namespace std;

class Student {
	int hak;
	const char* name;
public:
	Student() {
		hak = 1234;
		name = "이사랑";
		cout << "학번이 등록되었습니다." << endl;
	}
	Student(int hak, const char* name) {
		this->hak = hak;
		this->name = name;
	}
	void show() {
		cout << "학번 : " << hak << endl;
		cout << "이름 : " << name << endl;
	}
};

int main() {

	Student stu1;
	Student stu2(5678, "마리아");
	stu1.show();
	stu2.show();

	return 0;
}