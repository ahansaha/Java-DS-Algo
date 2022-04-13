package souvik.lvltwo.linkedListOne.deleteNodeRecursively;

public class Solution {

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	if(head == null) {
    		return head;
    	}
    	if(pos == 0) {
    		LinkedListNode<Integer> oldHead = head;
    		head = head.next;
    		oldHead.next = null;
    		return head;
    	}
    	LinkedListNode<Integer> smallHead = deleteNodeRec(head.next, pos - 1);
    	head.next = smallHead;
    	return head;
	}

}
