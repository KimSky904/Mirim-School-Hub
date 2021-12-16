#include<iostream>
#include<fstream>
using namespace std;

//구조체
struct students {
    char name[20];
    int score;
    int rank;
};
int main() {
    char userName[20];
    int score;
    ofstream output("database.txt", ios::app);
    cin >> userName;
    cin >> score;
    //점수 저장
    output << userName << " " << score << "\n";
    output.close();


    //파일 줄 수 세기
    ifstream input("data.txt");
    int line = 3;
    //char name[80];
    //while (!input.eof()) {
    //    cin.getline(name, 80);
    //    cout << "문자열 출력 : " << name << endl;
    //}


    students* stu = new students[line];
    for (int i = 0; i < line; i++) {
        input >> stu[i].name;
        input >> stu[i].score;
    }
    input.close();

    //순위 저장
    for (int i = 0; i < line; i++) {
        stu[i].rank = 1;
        for (int j = 0; j < line; j++) {
            if (stu[i].score < stu[j].score) stu[i].rank++;
        }
    }


    //순위 출력
    for (int i = 0; i < line; i++) {
        cout << stu[i].rank << endl;
    }


    return 0;
}