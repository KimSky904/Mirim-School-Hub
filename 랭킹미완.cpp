#include<iostream>
#include<fstream>
using namespace std;

//����ü
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
    //���� ����
    output << userName << " " << score << "\n";
    output.close();


    //���� �� �� ����
    ifstream input("data.txt");
    int line = 3;
    //char name[80];
    //while (!input.eof()) {
    //    cin.getline(name, 80);
    //    cout << "���ڿ� ��� : " << name << endl;
    //}


    students* stu = new students[line];
    for (int i = 0; i < line; i++) {
        input >> stu[i].name;
        input >> stu[i].score;
    }
    input.close();

    //���� ����
    for (int i = 0; i < line; i++) {
        stu[i].rank = 1;
        for (int j = 0; j < line; j++) {
            if (stu[i].score < stu[j].score) stu[i].rank++;
        }
    }


    //���� ���
    for (int i = 0; i < line; i++) {
        cout << stu[i].rank << endl;
    }


    return 0;
}