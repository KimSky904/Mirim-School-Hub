#include<iostream>
using namespace std;

class Student {
	int hak;
	const char* name;
public:
	Student() {
		hak = 1234;
		name = "�̻��";
		cout << "�й��� ��ϵǾ����ϴ�." << endl;
	}
	Student(int hak, const char* name) {
		this->hak = hak;
		this->name = name;
	}
	void show() {
		cout << "�й� : " << hak << endl;
		cout << "�̸� : " << name << endl;
	}
};

int main() {

	Student stu1;
	Student stu2(5678, "������");
	stu1.show();
	stu2.show();

	return 0;
}