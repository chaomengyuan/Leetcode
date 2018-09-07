#include <stdio.h>
#include <limits.h>
#include <stdbool.h>


long reverse(int x);

bool isPalindrome(int x) {
	bool isPalindrome = false;

	if (x < 0)
		return isPalindrome;

    long reverseX = reverse(x);	
    if (reverseX==(long)x)
    	isPalindrome = true;

    return isPalindrome;
}


long reverse(int x){
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
	
	return reverseLongX * sign;
}

int main(){
	printf("%d\n", isPalindrome(-1221));
	printf("%d\n", isPalindrome(1221));
	//printf("%d\n", reverse(-1));
	//printf("%d\n", reverse(1));
}
