#include<iostream>
using namespace std;


class Student {
public:
	int hal;
	const char* name;

	Student() {
		cout << "��ü ������" << endl;
	}
	Student(int h, const char* name) : hal(h),name(name) {
		cout << "��ü ������2" << endl;
	}
};
int main() {

	Student stu(1,"�ϴ�");
	Student stu2 = {2,"���ϴ�"};
	return 0;
}