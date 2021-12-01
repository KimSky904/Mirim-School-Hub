#include<iostream>
using namespace std;
template <typename T>
T GreatValue(T a, T b) {
	if (a > b) return a;
	else return b;
}

template<>
char* GreatValue(char* a, char* b) {
	cout << "Max(char* a,char* b)" << endl;
	return strlen(a) > strlen(b) ? a : b;
}
template<>
const char* GreatValue(const char* a, const char* b) {
	cout << "Max(const char* a,const char* b)" << endl;
	return strcmp(a, b) > 0 ? a : b;
}
int main(void) {
	cout << GreatValue(100, 200) << "   ";
	cout << GreatValue('A', 'B') << "   ";
	cout << GreatValue(12.34, 56.78) << "   " << endl;
	cout << GreatValue("Computer", "Science") << "   ";
	char str1[] = "Meister";
	char str2[] = "Mirim";
	cout << GreatValue(str1, str2) << endl;
	return 0;
}
