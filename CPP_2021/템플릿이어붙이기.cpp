#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;
template <typename T>
T add(T x, T y) {
    return x + y;
}

char* add(char* s1, char* s2) {
    char* str = new char[100];
    strcpy(str, s1);
    strcat(str, s2);
    return str;
}

int main()
{
    char num1[] = "10", num2[] = "20";
    cout << add(num1, num2) << endl;

    return 0;
}