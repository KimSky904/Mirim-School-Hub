#include<iostream>
using namespace std;


class Student {
public:
	int hal;
	const char* name;

	Student() {
		cout << "按眉 积己凳" << endl;
	}
	Student(int h, const char* name) : hal(h),name(name) {
		cout << "按眉 积己凳2" << endl;
	}
};
int main() {

	Student stu(1,"窍疵");
	Student stu2 = {2,"辫窍疵"};
	return 0;
}