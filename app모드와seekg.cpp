#include<iostream>
#include<fstream>
using namespace std;
int main() {
	ifstream input("output.txt",ios::app); //abcdefghijklmnopqrstuvwxyz
	if (input.fail()) {
		cout << "������ ���� �� �����߽��ϴ�." << endl;
		return 1;
	}

	input.seekg(0, ios::end); //fp(file pointer)�� ���� ������ ��ġ�� �̵�
	cout << (char)input.get() << endl;
	//input.clear();
	input.seekg(-5, ios::cur); //fp(file pointer)�� ���� Ŀ��(������)�κ��� 5�� �������� �̵�
	cout << (char)input.get() << endl;
	input.close();
	return 0;

	/*
	[13�� line�� �����ϰ� �������� ��� ����� �ٸ��� �ƹ� ���ڵ� ��µ��� �ʴ� ���� �߻�]
		get()����
		cpp�� ��Ʈ���� endofbit��� �÷��װ� �ִµ�, ������Լ��� ���� ���� ������ ��� ���̻� ������� ������ ����
		+peek()�Լ��� ����� �Լ��� �ƴϱ� ������ ���� �̽��� �߻����� ����
	=> clear() ���

	*/

}