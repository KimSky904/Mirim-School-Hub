#include<iostream>
using namespace std;
class Point {
public:
	Point() {
		cout << "�⺻������" << endl;
	}
	Point(int x,int y) {}
	int x, y;
};
int main() {

	Point p1;
	Point p2();
	Point p3 = { 1,2 };

	return 0;
}