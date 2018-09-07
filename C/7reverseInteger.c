#include <stdio.h>
#include <limits.h>


int reverse(int x){
	int sign = 1;
	long longX = x;
	long reverseLongX = 0;


	if (longX < 0) {
		longX = -longX;
		sign = -1;
	}

	while (longX > 0) {
		reverseLongX = reverseLongX * 10 + longX % 10;
		longX = longX / 10;
	}
	
	reverseLongX = reverseLongX * sign;
	if (reverseLongX > INT_MAX || reverseLongX <INT_MIN)
		return 0;
	else
		return (int)reverseLongX;
}

int main(){
	printf("%d\n", reverse(-112321421441));
	//printf("%d\n", reverse(-1));
	//printf("%d\n", reverse(1));
}
