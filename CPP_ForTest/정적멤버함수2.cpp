#include<iostream>
using namespace std;

class Car {
	int ton;
	int price;
public:
	static int count;
	Car() {
		cout << "��ü ����" << endl;
		count++;
	}
	Car(int ton, int price) :ton(ton), price(price) {
		cout << "��ü ����" << endl;
		count++;
	}
	int getCount() {
		return count;
	}

};

int Car::count = 0;
int main() {
	Car car1;
	cout << car1.getCount() << endl;
	Car car2;
	cout << car1.getCount() << endl;
	return 0;
}