package souvik.lvltwo.linkedListTwo.bubbleSort;

public class Solution {
	
	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int I, int J) {
		
		if(head == null || I == J) {
			return head;
		}
		
		//J should be always greater than I
		if(I > J) {
			int t = I;
			I = J;
			J = t;
		}
		
		//Initialize variables
		LinkedListNode<Integer> temp = head, nodePrevI = null, nodeI = null, nodeInext = null,
											 nodePrevJ = null, nodeJ = null, nodeJnext = null;
		int idxI = 0, idxJ = 0;
		
		
		//Move I and J to respective positions
		if(I == 0) {
			nodeI = temp;
			nodeInext = temp.next;
		}
		else {
			while(temp != null && temp.next != null) {
				if(idxI == I - 1) {
					nodePrevI = temp;
					nodeI = temp.next;
					nodeInext = temp.next.next;
					break;
				}
				idxI++;
				temp = temp.next;
			}
		}
		
		temp = head;
		
		while(temp != null && temp.next != null) {
			if(idxJ == J - 1) {
				nodePrevJ = temp;
				nodeJ = temp.next;
				nodeJnext = temp.next.next;
				break;
			}
			idxJ++;
			temp = temp.next;
		}
		
		//If I or J out of range
		if(idxJ != J - 1) {
			return head;
		}
		if(idxI != I - 1) {
			if(idxI != 0) {
				return head;
			}
		}
		
		//Swap node depending on the positions
		if(I == 0 && J == 1) {
			LinkedListNode<Integer> newHead = nodeJ;
			nodeJ.next = nodeI;
			nodeI.next = nodeJnext;
			return newHead;
		}
		else if(I == 0 && J != 1) {
			LinkedListNode<Integer> newHead = nodeJ;
			nodeJ.next = nodeI.next;
			nodeI.next = nodeJnext;
			nodePrevJ.next = nodeI;
			return newHead;
		}
		else if(I + 1 == J) {
			nodePrevI.next = nodeJ;
			nodeJ.next = nodeI;
			nodeI.next = nodeJnext;
		}
		else {
			nodePrevI.next = nodeJ;
			nodeJ.next = nodeI.next;
			nodePrevJ.next = nodeI;
			nodeI.next = nodeJnext;
		}
		
		return head;
	}
	
	public static int length(LinkedListNode<Integer> head){
		int c = 0;
		while(head != null) {
			head = head.next;
			c++;
		}
		return c;
	}

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		
		LinkedListNode<Integer> temp = head;
		int idxI = 0, idxJ = 0, n = length(head);		
		
		if(n == 0 || n == 1) {
			return head;
		}
		
		while(idxI < n - 1) {			
			while(idxJ < n - idxI - 1) {				
				if(temp.data > temp.next.data) {
					head = swapNodes(head, idxJ, idxJ + 1);
				}
				else {
					temp = temp.next;					
				}
				idxJ++;
			}
			idxJ = 0;
			temp = head;
			idxI++;
		}
		
		return head;
	}
}
