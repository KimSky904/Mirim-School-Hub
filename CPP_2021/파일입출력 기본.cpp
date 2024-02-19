#include<fstream>
#include<iostream>
#include<string>
using namespace std;
int main() {
	//입력
	string out_line;
	ofstream out("test.txt");
	for (int i = 0; i < 10; i++) {
		cin >> out_line;
		out << out_line << endl;
	}
	out.close();

	//출력
	string in_line;
	ifstream in("text.txt");
	while (getline(in, in_line)) {
		cout << in_line << endl;
	}
	in.close();
}