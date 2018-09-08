#include <stdio.h>

int romanToInt(char* s) {
 	int i = 0;
 	int integer = 0;
 	while(s[i]!='\0'){
 		switch(s[i]){
 			case 'I':
 				if(s[i+1] == 'V' || s[i+1] == 'X') 
 					integer += -1;
 				else
 					integer += 1;
 				break;
 			case 'V':
 				integer += 5;
 				break;
 			case 'X':
 				if(s[i+1] == 'L' || s[i+1] == 'C') 
 					integer += -10;
 				else
 					integer += 10;
 				break;
 			case 'L':
 				integer += 50;
 				break;
 			case 'C':
 			 	if(s[i+1] == 'D' || s[i+1] == 'M') 
 					integer += -100;
 				else
 					integer += 100;
 				break;
 			case 'D':
 				integer += 500;
 				break;
 			case 'M':
 				integer += 1000;
 				break;
 		}
 		i++;
 	}
 	return integer;   
}

int main (int argn, char** args){
	char * romanString = args[1];
	printf("%s\n",romanString);
	printf("%d\n", romanToInt(romanString));
}