#include<iostream>
using namespace std;
class TestC {
	int iData;
public:
	TestC() {
		cout << "�⺻������" << endl;
	}
	~TestC() {
		cout << "�⺻�Ҹ���" << endl;
	}
};
int main() {
	cout << "begin" << endl;
	//TestC* ptr = new TestC;
	unique_ptr<TestC[]> ptr(new TestC[2]);
	cout << "plus" << endl;
	//delete ptr;
	cout << "End" << endl;
	return 0;
}