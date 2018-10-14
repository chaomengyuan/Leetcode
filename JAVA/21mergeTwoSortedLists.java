import java.lang.String;


class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

 
class Solution1 {

	ListNode mergeList;

	public Solution(){
		mergeList = new ListNode(0);
		mergeList.next = null;
	} 




    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode currentNode = mergeList;

    	while(l1!=null && l2!=null){
    		ListNode newNode;
    		if (l1.val < l2.val){
    			newNode = new ListNode(l1.val);
    			newNode.next = null;
    			currentNode.next = newNode;
    			currentNode = newNode;
    			l1 = l1.next;
    		}
    		else{
    			newNode = new ListNode(l2.val);
    			newNode.next = null;
    			currentNode.next = newNode;
    			currentNode = newNode;
    			l2 = l2.next;
    		}
    	}

    	if(l1==null){
    		while(l2!=null){
    			ListNode newNode = new ListNode(l2.val);
    			newNode.next = null;
    			currentNode.next = newNode;
    			currentNode = newNode;
    			l2 =l2.next;
    		}
    	} else {
    		while(l1!=null){
    			ListNode newNode = new ListNode(l1.val);
    			newNode.next = null;
    			currentNode.next = newNode;
    			currentNode = newNode;
    			l1=l1.next;
    		}
    	}
    	return mergeList.next;    
    }

}

class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        
        if (l1 != null) {
            l3.next = l1;
        }
        
        if (l2 != null) {
            l3.next = l2;
        }
        
        return dummy.next;        
    }

}

public class 21mergeTwoSortedLists {

	public static void main(String[] args){
    	ListNode  n11 = new ListNode(1);
    	ListNode  n12 = new ListNode(2);
    	ListNode  n13 = new ListNode(4);
    	n11.next = n12;
    	n12.next = n13;

    	ListNode  n21 = new ListNode(1);
    	ListNode  n22 = new ListNode(3);
    	ListNode  n23 = new ListNode(4);
    	n21.next = n22;
    	n22.next = n23;

    	Solution1 solution1 = new Solution1();
    	ListNode merge = solution1.mergeTwoLists(n11,n21);

		//Solution2 solution2 = new Solution2();
    	//ListNode merge2 = solution2.mergeTwoLists(n11,n21);

        while(n11!=null){
    		System.out.print(n11.val);
    		n11 = n11.next;
    	}

    	System.out.println();

    	while(n21!=null){
    		System.out.print(n21.val);
    		n21 = n21.next;
    	}

		System.out.println();

    	while(merge1!=null){
    		System.out.print(merge1.val);
    		merge1 = merge1.next;
    	}

    	// while(merge2!=null){
    	// 	System.out.print(merge2.val);
    	// 	merge2 = merge2.next;
    	// }

    	System.out.println();
    }
}


/// COMMENTS ///
// The difference between Solution1 and Solution2 is that, Solution1 will not change thr original list while Solution2 will cahnge.