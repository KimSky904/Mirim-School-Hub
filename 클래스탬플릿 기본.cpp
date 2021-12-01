#include<iostream>
using namespace std;
template<class T>
class MyData {
	T myData;
public:
	void setData(T pdata);
	T getData();
};

template<class T>
void MyData<T>::setData(T pdata) {
	myData = pdata;
}
template<class T>
T MyData<T>::getData() {
	return myData;
}

void main() {
	MyData<int> mydata1;
	MyData<double> mydata2;

	mydata1.setData(5);
	cout << mydata1.getData() << endl;
	mydata2.setData(5.1);
	cout << mydata2.getData() << endl;
}