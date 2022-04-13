package souvik.lvltwo.linkedListOne.appendLastNToFirst;

public class Solution {
	
	public static int length(LinkedListNode<Integer> head){
		int c = 0;
		while(head != null) {
			head = head.next;
			c++;
		}
		return c;
	}

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		final int len = length(head);
		
		if(n == 0 || n == len || len == 0) {
			return head;
		}
		
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> newHead = null;
		int lastIdx = len - n - 1;
		int idx = 0;
		
		while(temp != null) {
			if(idx == lastIdx) {
				newHead = temp.next;
				temp.next = null;
				break;
			}
			idx++;
			temp = temp.next;
		}
		
		LinkedListNode<Integer> newTemp = newHead;
		while(newTemp.next != null) {
			newTemp = newTemp.next;
		}
		
		newTemp.next = head;
		return newHead;		
	}
}
