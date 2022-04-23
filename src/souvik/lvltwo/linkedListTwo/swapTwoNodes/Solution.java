package souvik.lvltwo.linkedListTwo.swapTwoNodes;

public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int I, int J) {
		
		if(head == null || I == J) {
			return head;
		}
		
		if(J > I) {
			int t = I;
			I = J;
			J = t;
		}
		
		LinkedListNode<Integer> temp = head, nodePrevI = null, nodeI = null, nodeInext = null,
											 nodePrevJ = null, nodeJ = null, nodeJnext = null;
		int idxI = 0, idxJ = 0;
		
		while(temp != null) {
			if(idxI == I - 1) {
				nodePrevI = temp;
				nodeI = temp.next;
				nodeInext = temp.next.next;
				break;
			}
			idxI++;
			temp = temp.next;
		}
		
		while(temp != null) {
			if(idxJ == J - 1) {
				nodePrevJ = temp;
				nodeJ = temp.next;
				nodeJnext = temp.next.next;
				break;
			}
			idxJ++;
			temp = temp.next;
		}
		
		//Code here if I or J out of range 
		{
			
		}
		
		if(I == 0 && J == 1) {
			LinkedListNode<Integer> newHead = nodeJ;
			nodeJ.next = nodeI;
			nodeI.next = nodeJnext;
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
			nodePrevJ = nodeI;
			nodeI.next = nodeJnext;
		}
		
	}

}
