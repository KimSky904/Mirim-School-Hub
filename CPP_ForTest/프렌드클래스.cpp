#include<iostream>
using namespace std;
class MyClass {
	int x, y, z;
public:
	MyClass(int x, int y, int z) {
		this->x = x;
		this->y = y;
		this->z = z;
	}
	friend class FriendClass;
};
class FriendClass {
public:
	FriendClass() {
		MyClass my(1, 2, 3);
		cout << my.x << endl;
	}
};
int main(void) {
	FriendClass fc;
}