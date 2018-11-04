class Solution {
    public String addBinary(String a, String b) {
    	if (a==null || a.length() == 0)
    		return b;
    	if (b==null || b.length() == 0)
    		return a;
    	
    	int pa = a.length()-1;
    	int pb = b.length()-1;
    	int carry = 0;
    	StringBuilder strb = new StringBuilder();

    	while(pa>=0 || pb>=0){
    		int va=0, vb=0;	// don't forget to set to 0 each loop

    		if(pa>=0){
    			va= (a.charAt(pa) == '0') ? 0 : 1;
    			pa--;
    		}
			if(pb>=0){
    			vb= (a.charAt(pb) == '0') ? 0 : 1;
    			pb--;
    		}

    		int sum = carry + va + vb;
    		if (sum >=2){
    			strb.append(String.valueOf(sum-2));
    			carry = 1;
    		} else {
    			strb.append(String.valueOf(sum));
    			carry = 0;
    		}
    	}

    	if(carry ==1){
    		strb.append('1');
    	}

    	return strb.reverse().toString();
    }
}