#include<iostream>
using namespace std;
template <typename T>
class MyData {
	T nData;
public:
	MyData(T t) : nData(t) {}
	void print() {
		cout << nData << ",  ";
	}
};

//Æ¯¼öÈ­
template<>
class MyData<char*> {
	char* nData;
public:
	MyData(char* t) : nData(t) {}
	void print() {
		cout << "string value : " << nData << ",  ";
	}
};

void main() {
	int i = 3456;
	MyData<int> myData1(i);
	char str[20] = "IT Meister";
	char* str1 = str;
	MyData<char*> myData2(str1);
	myData1.print();
	myData2.print();
}