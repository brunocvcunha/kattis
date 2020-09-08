#include <iostream>
#include <cmath>

using namespace std;
typedef long double ld;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        int n1, n2, n3;
        cin >> n1 >> n2 >> n3;

        if (n1 + n2 == n3
            || abs(n1 - n2) == n3
            || n1 * n2 == n3
            || (n1 / n2 == n3 && n1 % n2 == 0)
            || (n2 / n1 == n3 && n2 % n1 == 0)) {
            cout << "Possible\n";
        } else {
            cout << "Impossible\n";
        }
    }

}