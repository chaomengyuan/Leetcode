#include <stdio.h>

char commonPrefix[100];	   // not strict ...

char* substring(char* desStr, char* srcStr, int pos, int length){
	int i = 0;
	while (i < length){
		desStr[i] = srcStr[pos+i-1];
		i++;
	}
    desStr[i]='\0';
    return desStr;
}

char* longestCommonPrefix(char** strs, int strsSize) {
    int j = 0; 

    while (strs[0][j]!='\0'){
    	int i;
    	for (i = 1; i < strsSize; i++){
    		if (strs[i][j]!='\0' && strs[i][j] == strs[0][j])
    			continue;			
    		else 
    			return (char *) substring(commonPrefix, strs[0],1,j);
    	}
    	j++;
    }

    return (char *) substring(commonPrefix, strs[0],1,j);
}


int main () {
	char * stringArray1[] ={"flower","flow","flight"};
	char * stringArray2[] = {"dog","racecar","car"};
	printf("%s\n",longestCommonPrefix(stringArray1,3));
	printf("%s\n",longestCommonPrefix(stringArray2,3));
}