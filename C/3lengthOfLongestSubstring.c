int lengthOfLongestSubstring(char* s) {
	char* head = s;
	char* tail = s;
	int maxLength = 0;
    int length = 0;
	char* tmp;

	while ((*tail) != '\0') {
		tmp = head;
		while (*tmp != *tail) {
			tmp++;
		} 
        if (tmp<tail) {	
            maxLength = (maxLength>=(tail-head)) ? maxLength : tail-head;
            head = ++tmp;
            tail++;
            length = tail-head;
        } else{
            length++;
            tail++;
        } 		
	}
    maxLength = maxLength > length ? maxLength : length;
    
	return maxLength;
}


//// Comments: (1) make sure the algorithm is clear and correct before coding;
               (2) be careful about the difference between variable++ and ++variable;
			   (3) testcase first, then code