#include<iostream>
using namespace std;
class Ride {
public:
	virtual void rideFunc() {
		cout << "타다" << endl;
	}
};
class BusRide : public Ride {
public:
	int age;
	void rideFunc() {
		cout << "버스타다" << endl;
	}
	void rideFunc2() {
		cout << "버스날다" << endl;
	}
};
class AirRide : public Ride {
public:
	int ton;
	void rideFunc() {
		cout << "뱅기타다" << endl;
	}
	void rideFunc2() {
		cout << "뱅기날다" << endl;
	}
	void print() {
		cout << "프린트" << endl;
	}
};
int main() {
	//BusRide r1;
	//r1.rideFunc(); //버스타다
	//r1.rideFunc2(); //버스날다
	//AirRide* r2 = new AirRide();
	//r2->rideFunc2(); //뱅기날다
	//Ride* r3 = new AirRide();
	//r3->rideFunc2(); //날다

	//AirRide air;
	//air.print();

	Ride* r3 = new AirRide();
	r3->rideFunc2(); //날다

	return 0;
}