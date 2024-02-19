#include<iostream>
#include<cstring>
#include<string>
using namespace std;
class Person {
public:
	string name;
	int hakbun;
	Person(string name, int hak) {
		this->name = name;
		hakbun = hak;
	}
	void PrintShow() {
		cout << "이름 : " << name << endl;
		cout << "학번 : " << hakbun << endl;
	}
};
class Student : public Person {
	string uni;
public:
	Student(string name, int hak, string uni) : Person(name,hak) {
		this->uni = uni;
	}
	void PrintShow() {
		Person::PrintShow();
		cout << "학교 : " << uni << endl;
	}

};
int main() {
	Student st1("홍길동", 2018, "한국대학교");
	st1.PrintShow();

	return 0;
}