#include<iostream>
using namespace std;


class Student {
public:
	int hak;
	const char* name;

	Student() {
		cout << "°´Ã¼ »ı¼ºµÊ" << endl;
	}
};
int main() {


	Student stu;
	stu.hak = 123;
	cout << stu.hak << endl;

	Student *stu1 = new Student();
	stu1->hak = 1234;

	return 0;
}