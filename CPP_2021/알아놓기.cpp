#include<vector>
#include<iostream>
#include<algorithm>
#include<string>
#include<fstream>
#include<iomanip> //setw(10)
using namespace std;

void show(const int& item) {
	cout << item << "  ";
}
int main() {
	/*  ����  */
	 
	//����
	srand((unsigned)time(NULL));
	int random = (int)(rand() % 46) + 1;
	const int num = 5;
	vector<int> v(num);
	//�ε��� ���� ����
	for (int i = 0; i < v.size(); i++) 
		cout << v[i] << "  "; 	 	
	//���
	// 1. iterator
	 vector<int>::iterator Iter;
	 for (Iter = v.begin(); Iter != v.end(); Iter++) cout << "  " << *Iter;
	// 2. ÷�� ���
	 for(int i=0;i<num;i++)  cout << "  " << v[i];
	// 3. auto
	 for(auto& e:v) cout << "  " << e;
	// 4. �˰��� ���
	 for_each(v.begin() + 1, v.end() - 1, show);

	//����
	v.insert(v.begin() + 2, v.begin() + 1, v.begin() + 3); //v�� 3��° �ڸ��� v�� �ι�°���� 4-1��° ���� �������
	v.insert(v.begin() + 2, 4, 50); //v[2]���� 50�� 4�� ����
	//����
	v.erase(v.begin());
	v.erase(v.begin() + 1, v.begin() + 4); //v�� �ι�°���� 5-1��° ���� ����
	//3��° �� ����
	v.at(2) = 500;
	//����
	v.assign(3, 7); //7 3�� �߰�
	//����
	const auto v2 = v;





	/*  ���������  */

	//���Ͽ��� �о����
	char empNum[20];
	char empName[20];
	char position[20];
	ifstream fin("info.txt");
	while (fin >> empNum >> empName >> position) {
		cout << empNum << setw(10) << empName << setw(10) << position << endl;
	}
	//���Ͽ�����
	ofstream fout("info.txt", ios::app);
	for (int i = 0; i < 1; i++) {
		cout << i + 1 << "��° ����� ����� �Է��ϼ��� : ";
		cin >> empNum;
		cout << "�̸��� �Է��ϼ��� : ";
		cin >> empName;
		cout << "������ �Է��ϼ��� : ";
		cin >> position;
		fout << empNum << setw(10) << empName << setw(10) << position << endl;
		cout << empNum << setw(10) << empName << setw(10) << position << endl;
		cout << endl;
	}
	//���Ͽ� �̾ ����
	ofstream fout("sample.txt", ios::app);
	fout << "append line 1" << endl;
	//���Ͽܺΰ��
	ofstream fout("c:/temp/address.txt");
	//cout
	char str[] = "C++ Exiting";
	cout.write(str, 3); //c++
	cout.put('M');
	//���ٺ��纹��
	char addr[80];
	cout << "���ڿ� �Է� : ";
	while (true) {
		cin.getline(addr, 80);
		if (strcmp(addr, "exit") == 0) break;
		cout << "���ڿ� ��� : " << addr << endl;
		cout << "���ڿ� �Է� : ";
	}
	ifstream input("input.txt");
	string line;
	while (!input.eof()) {
		getline(input, line);
		cout << "�Է��� ����: " << line << endl;
	}


	//���
	//�Ҽ��� ��������
	cout.setf(ios::showpoint);
	//��ȣ ǥ��
	cout.setf(ios::showpos);
	//��ȣ ǥ�� ����
	cout.unsetf(ios::showpos);
	//���ξ� ǥ��
	cout.setf(ios::showbase);
	//�빮�� ǥ��
	cout.setf(ios::uppercase);
	//���� *�� ä��
	cout.fill('*');
	//. �����ϰ� 5�ڸ� ���
	cout.precision(5);



	//��������
	ofstream fo_bin("data.bin", ofstream::binary);
	int nArray[] = { 100,200,300,400,500,600 };
	fo_bin.write((char*)&nArray, sizeof(nArray));

	int nArray2[6] = {};
	ifstream fi_bin("data.bin", ifstream::binary);
	fi_bin.read((char*)&nArray2, sizeof(nArray2));
	for (auto& e : nArray2) {
		cout << e << "   ";
	}
	char a[16] = "any such text";
	ofstream x("test.txt");
	streamsize y = 6;
	x.write(a, y);

	//���ڼ�����
	ifstream fin("sample.txt");
	fin.seekg(0, ios::end); //�ش� ��ġ�������� ��
	cout << "������ ũ��� " << fin.tellg() << endl; 



	//��ŷ
	ifstream input("input.txt");
	input.seekg(-1, ios::end);  //������ ���� ���
	cout << (char)input.peek(); //char��ŭ�� ���� �ϳ��� ����
	input.seekg(0, ios::beg);
	cout << (char)input.get(); //�а� ������ �̵�
	input.seekg(7, ios::cur);
	input.seekg(5); //0 : �� ������, 5 -> 6��°��
	ofstream output("output.txt");
	cout << "���� ��ġ�� " << output.tellp() << "�Դϴ�." << endl; //input.seekg(0, ios::end); �� �� ���ڼ� �� �� ����
	input.seekg(0, ios::end); //endoffile, �ȳ���
	cout << (char)input.get() << endl;
	input.clear();



	//�˰���
	string word;
	reverse(word.begin(), word.end());
	//����
	int a[5] = { 1, 2, 3, 4, 5 };
	int b[5] = { 6, 7, 8, 9, 10 };
	random_shuffle(a, a + 5);
	random_shuffle(b + 1, b + 4);
	for_each(a, a + 5, print);
}


void print(int n) {

	cout << n << endl;

}


