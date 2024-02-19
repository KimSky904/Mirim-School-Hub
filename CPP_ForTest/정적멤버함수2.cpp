#include<iostream>
using namespace std;

class Car {
	int ton;
	int price;
public:
	static int count;
	Car() {
		cout << "梓端 持失" << endl;
		count++;
	}
	Car(int ton, int price) :ton(ton), price(price) {
		cout << "梓端 持失" << endl;
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