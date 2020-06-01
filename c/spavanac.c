#include <stdio.h>
#include <string.h>

int main() {
	int hour, min;

	(void) scanf("%d %d", &hour, &min);
	
	min -= 45;
	
	if (min < 0) {
		min = 60 - (min * -1);
		hour--;

		if (hour < 0) {
			hour = 23;
		}
	}

	printf("%d %d\n", hour, min);
	
}