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
		cout << "�̸� : " << name << endl;
		cout << "�й� : " << hakbun << endl;
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
		cout << "�б� : " << uni << endl;
	}

};
int main() {
	Student st1("ȫ�浿", 2018, "�ѱ����б�");
	st1.PrintShow();

	return 0;
}