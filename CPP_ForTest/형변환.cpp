#include<iostream>
using namespace std;
class Ride {
public:
	virtual void rideFunc() {
		cout << "Ÿ��" << endl;
	}
};
class BusRide : public Ride {
public:
	int age;
	void rideFunc() {
		cout << "����Ÿ��" << endl;
	}
	void rideFunc2() {
		cout << "��������" << endl;
	}
};
class AirRide : public Ride {
public:
	int ton;
	void rideFunc() {
		cout << "���Ÿ��" << endl;
	}
	void rideFunc2() {
		cout << "��⳯��" << endl;
	}
	void print() {
		cout << "����Ʈ" << endl;
	}
};
int main() {
	//BusRide r1;
	//r1.rideFunc(); //����Ÿ��
	//r1.rideFunc2(); //��������
	//AirRide* r2 = new AirRide();
	//r2->rideFunc2(); //��⳯��
	//Ride* r3 = new AirRide();
	//r3->rideFunc2(); //����

	//AirRide air;
	//air.print();

	Ride* r3 = new AirRide();
	r3->rideFunc2(); //����

	return 0;
}