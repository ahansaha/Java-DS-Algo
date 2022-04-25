package souvik.lvltwo.linkedListTwo.kReverse;

public class Solution {
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		
		if(head == null || k == 0) {
			return head;
		}
		
		//jno -> jump node odd, jnn -> jump node new
		LinkedListNode<Integer> finalHead = null, jno = null, jnn = head,
								t1 = null, t2 = head, t3 = null;
		int idxK = 0;
		
		while(t2 != null) {
			
			t3 = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = t3;			
			idxK++;
			
			if(idxK == k) {
				
				if(finalHead == null) {
					finalHead = t1;
				}
				
				if(jno != null) {
					jno.next = t1;
				}				
				jno = jnn;
				jnn = t2;
				
				t1 = null;
				t3 = null;
				idxK = 0;
			}
		}
		
		if(idxK != 0) {
			jno.next = t1;
		}
		
		return finalHead;
	}	
}