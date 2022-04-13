package souvik.lvltwo.linkedListOne.findNodeInLinkedList;

public class Solution {
	
	public static int findNode(LinkedListNode<Integer> head, int n) {
		int idx = 0;
		while(head != null) {
			if(head.data == n) {
				return idx;
			}
			idx++;
			head = head.next;
		}
		return -1;
	}
}
