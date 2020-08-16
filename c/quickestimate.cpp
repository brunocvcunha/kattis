#include <stdio.h>
#include <string>
#include <iostream>
#include <algorithm>
#include <math.h>

using namespace std;

int main() {
	int n;
    cin >> n;

    for (int i = 0; i < n; i++) {

        string est;
        cin >> est;

        cout << est.length() << '\n';
    }
    return 0;
}
