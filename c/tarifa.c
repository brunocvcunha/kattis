#include <stdio.h>
#include <string.h>

int main() {
	int x, n;
	(void) scanf("%d %d", &x, &n);
	
	int leftover = 0;
	for (int i = 0; i < n; i++) {
		int spent;
		scanf("%d", &spent);

		leftover += x - spent;
	}

	printf("%d\n", leftover + x);
	
}
