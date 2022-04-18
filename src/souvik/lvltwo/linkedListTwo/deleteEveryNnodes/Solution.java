package souvik.lvltwo.linkedListTwo.deleteEveryNnodes;

public class Solution {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		
		if(M == 0 || head == null) {
			return null;
		} 
		else if(N == 0) {
			return head;
		}
		
		LinkedListNode<Integer> temp = head, mTail = null, nTail = null;
		int idxM = 0, idxN = 0;
		
		while(true) {
			
			while(idxM < M - 1 && temp != null) {
				idxM++;
				temp = temp.next;
				mTail = temp;
			}
			if(temp == null) {
				return head;
			}
			
			while(idxN < N && temp != null) {
				idxN++;
				temp = temp.next;
				nTail = temp;
			}
			if(temp == null) {
				mTail.next = null;
				return head;
			}
			
			mTail.next = nTail.next;
			temp = temp.next;
			
			//Reset variables for next iteration.
			idxM = 0;
			idxN = 0;
			mTail = null;
			nTail = null;
			
		}
	}
}