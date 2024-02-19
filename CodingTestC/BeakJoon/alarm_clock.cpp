#include<iostream>
using namespace std;
int main(void) {
	int h, m;
	cin >> h >> m;
	int ret;

	if (m >= 45) cout << h << " " << m - 45;
	else {
		ret = 45 - m;
		if (h > 0) {
			cout << h - 1 << " " << 60 - ret;
		}
		else cout << 23 << " " << 60 - ret;
	}
}