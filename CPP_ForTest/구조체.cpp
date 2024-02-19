#include<iostream>
using namespace std;

struct Point
{
	int x;
	int y;
	void func();
};
int main() {

	Point point = {1,2};
	Point *PPoint = &point;
	(*PPoint).func();

	return 0;
}

void Point::func() {
	cout << "함수입니다." << endl;
}



