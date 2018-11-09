class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();

        if(rowIndex<0) return list;

        list.add(1);
        for(int i=1; i <=rowIndex; i++){
        	for(int j =list.size()-1; j>0; j--){
        		list.set(j,list.get(j-1)+list.get(j));
        	}
        	list.add(1);
        }

        return list;

    }
}