#include <stdio.h>
#include <string>
#include <iostream>
#include <algorithm>
#include <math.h>

using namespace std;

int main() {
	int cx, cy, n;
    cin >> cx >> cy >> n;

    int max_ranges[n];

    for (int i = 0; i < n; i++) {

        int dx, dy, r;
        cin >> dx >> dy >> r;

        int distance = sqrt(pow(cx-dx, 2) + pow(cy-dy, 2)) - r;
        max_ranges[i] = distance;
    }

    sort(max_ranges, max_ranges + n);

    int max_range = max_ranges[2];
    if (max_range < 0) {
        max_range = 0;
    }

    cout << max_range;

    return 0;
}
