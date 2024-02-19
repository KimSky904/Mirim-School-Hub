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
	/*  백터  */
	 
	//랜덤
	srand((unsigned)time(NULL));
	int random = (int)(rand() % 46) + 1;
	const int num = 5;
	vector<int> v(num);
	//인덱스 접근 가능
	for (int i = 0; i < v.size(); i++) 
		cout << v[i] << "  "; 	 	
	//출력
	// 1. iterator
	 vector<int>::iterator Iter;
	 for (Iter = v.begin(); Iter != v.end(); Iter++) cout << "  " << *Iter;
	// 2. 첨자 사용
	 for(int i=0;i<num;i++)  cout << "  " << v[i];
	// 3. auto
	 for(auto& e:v) cout << "  " << e;
	// 4. 알고리즘 출력
	 for_each(v.begin() + 1, v.end() - 1, show);

	//삽입
	v.insert(v.begin() + 2, v.begin() + 1, v.begin() + 3); //v의 3번째 자리에 v의 두번째부터 4-1번째 값을 집어넣음
	v.insert(v.begin() + 2, 4, 50); //v[2]부터 50을 4개 삽입
	//삭제
	v.erase(v.begin());
	v.erase(v.begin() + 1, v.begin() + 4); //v의 두번째부터 5-1번째 값을 지움
	//3번째 값 변경
	v.at(2) = 500;
	//지정
	v.assign(3, 7); //7 3개 추가
	//복사
	const auto v2 = v;





	/*  파일입출력  */

	//파일에서 읽어오기
	char empNum[20];
	char empName[20];
	char position[20];
	ifstream fin("info.txt");
	while (fin >> empNum >> empName >> position) {
		cout << empNum << setw(10) << empName << setw(10) << position << endl;
	}
	//파일에쓰기
	ofstream fout("info.txt", ios::app);
	for (int i = 0; i < 1; i++) {
		cout << i + 1 << "번째 사람의 사번을 입력하세요 : ";
		cin >> empNum;
		cout << "이름을 입력하세요 : ";
		cin >> empName;
		cout << "직급을 입력하세요 : ";
		cin >> position;
		fout << empNum << setw(10) << empName << setw(10) << position << endl;
		cout << empNum << setw(10) << empName << setw(10) << position << endl;
		cout << endl;
	}
	//파일에 이어서 쓰기
	ofstream fout("sample.txt", ios::app);
	fout << "append line 1" << endl;
	//파일외부경로
	ofstream fout("c:/temp/address.txt");
	//cout
	char str[] = "C++ Exiting";
	cout.write(str, 3); //c++
	cout.put('M');
	//한줄복사복붙
	char addr[80];
	cout << "문자열 입력 : ";
	while (true) {
		cin.getline(addr, 80);
		if (strcmp(addr, "exit") == 0) break;
		cout << "문자열 출력 : " << addr << endl;
		cout << "문자열 입력 : ";
	}
	ifstream input("input.txt");
	string line;
	while (!input.eof()) {
		getline(input, line);
		cout << "입력한 문장: " << line << endl;
	}


	//모드
	//소수점 생략안함
	cout.setf(ios::showpoint);
	//부호 표시
	cout.setf(ios::showpos);
	//부호 표시 제거
	cout.unsetf(ios::showpos);
	//접두어 표시
	cout.setf(ios::showbase);
	//대문자 표시
	cout.setf(ios::uppercase);
	//공백 *로 채움
	cout.fill('*');
	//. 제외하고 5자리 출력
	cout.precision(5);



	//이진파일
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

	//글자수세기
	ifstream fin("sample.txt");
	fin.seekg(0, ios::end); //해당 위치에서부터 셈
	cout << "파일의 크기는 " << fin.tellg() << endl; 



	//랭킹
	ifstream input("input.txt");
	input.seekg(-1, ios::end);  //마지막 글자 출력
	cout << (char)input.peek(); //char만큼의 문자 하나를 읽음
	input.seekg(0, ios::beg);
	cout << (char)input.get(); //읽고 포인터 이동
	input.seekg(7, ios::cur);
	input.seekg(5); //0 : 맨 앞으로, 5 -> 6번째값
	ofstream output("output.txt");
	cout << "현재 위치는 " << output.tellp() << "입니다." << endl; //input.seekg(0, ios::end); 로 총 글자수 알 수 있음
	input.seekg(0, ios::end); //endoffile, 안나옴
	cout << (char)input.get() << endl;
	input.clear();



	//알고리즘
	string word;
	reverse(word.begin(), word.end());
	//셔플
	int a[5] = { 1, 2, 3, 4, 5 };
	int b[5] = { 6, 7, 8, 9, 10 };
	random_shuffle(a, a + 5);
	random_shuffle(b + 1, b + 4);
	for_each(a, a + 5, print);
}


void print(int n) {

	cout << n << endl;

}


