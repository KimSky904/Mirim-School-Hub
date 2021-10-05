#include<iostream>
using namespace std;
class Point {
public:
	static int a;
	Point() {
		cout << "기본생성자" << endl;
	}
	Point(int x, int y) {}
	int x, y;
	int getValue() const {
		return x;
	}
};
int Point::a = 0;
int main() {

	Point p1;
	cout<<p1.getValue()<<endl;

	return 0;
}