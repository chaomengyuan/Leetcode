import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> lists = new ArrayList<List<Integer>>();
    	
    	List<Integer> list1 = new ArrayList<Integer>();
    	list1.add(1);
    	
    	List<Integer> list2 = new ArrayList<Integer>();
    	list2.add(1);
    	list2.add(1);

        if(numRows == 0){
        	return lists;
        }
    	
    	if(numRows == 1){
    		lists.add(list1);
    		return lists;
    	}

    	if(numRows == 2){
    		lists.add(list1);
    		lists.add(list2);
    		return lists;
    	}

    	lists.add(list1);
    	lists.add(list2);
    	for (int i = 2; i < numRows; i++){
    		List<Integer> prelist = lists.get(i-1);
    		List<Integer> listi = new ArrayList<Integer>();
    		listi.add(1); 
    		for(int j = 0; j< prelist.size()-1; j++) {
    			listi.add(prelist.get(j) + prelist.get(j+1));
    		}
    		listi.add(1);
    		lists.add(listi);
    	}
    	return lists;	
    }
}