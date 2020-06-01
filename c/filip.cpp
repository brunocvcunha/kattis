#include <stdio.h>
#include <string>
#include <iostream>
#include <algorithm>

using namespace std;

// Function to reverse a string
string reverse(string const &s)
{
	string rev(s.rbegin(), s.rend());
	return rev;
}

int main() {
	string first, second;
    cin >> first >> second;
	
    string firstrev = reverse(first);
    string secondrev = reverse(second);

    int firstrev_num = stoi(firstrev);
    int secondrev_num = stoi(secondrev);
    
    if (firstrev_num > secondrev_num) {
    	cout << firstrev;
    } else {
        cout << secondrev;
    }
	
    return 0;
}
