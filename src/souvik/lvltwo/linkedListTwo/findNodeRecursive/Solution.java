package souvik.lvltwo.linkedListTwo.findNodeRecursive;

public class Solution {

	public static int findNodeRec(LinkedListNode<Integer> head, int n, int idx) {
		
		if(head == null) {
			return -1;
		}
		
		if(head.data == n) {
			return idx;
		}
		
		return findNodeRec(head.next, n, idx + 1);
		
	}
	
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
		return findNodeRec(head, n, 0);
	}

}