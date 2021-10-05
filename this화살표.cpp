#include<iostream>
using namespace std;
class Student {
	int grade;
	int ban;
public:
	Student() {
		grade = 3;
		ban = 8;
	}
	~Student() {}
	void setGrade(int grade) {
		this->grade = grade;
	}
};
int main() {
	cout << "begin" << endl;
	//TestC* ptr = new TestC;
	cout << "plus" << endl;
	//delete ptr;
	cout << "End" << endl;
	return 0;
}