//명시적 특수화
#include<iostream>
using namespace std;
struct Job
{
	char name[40];
	double salary;
	int floor;
	void show() {
		cout << "name : " << name << ", salary : " << salary << ", floor : " << floor << endl;
	}
};

//템플릿
template <typename T>
void swapp(T& i, T& j) {
	T temp = i;
	i = j;
	j = temp;
}

//명시적 특수화
template <>
void swapp(Job& a, Job& b) {
	double temp1;
	temp1 = a.salary;
	a.salary = b.salary;
	b.salary = temp1;
	int temp2;
	temp2 = a.floor;
	a.floor = b.floor;
	b.floor = temp2;
}
void swapp(Job& a, Job& b);

int main(void) {

	double i = 10.1;
	double j = 20.2;
	cout << "i = " << i << endl;
	cout << "j = " << j << endl;
	swapp(i, j);
	cout << "i = " << i << endl;
	cout << "j = " << j << endl;

	cout << endl;

	Job j1 = { "강아지",127.8,3 };
	Job j2 = { "망아지",185.2,5 };
	j1.show();
	j2.show();
	swapp(j1, j2);
	j1.show();
	j2.show();


	return 0;
}