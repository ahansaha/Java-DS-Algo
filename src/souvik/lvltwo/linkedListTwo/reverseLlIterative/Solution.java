package souvik.lvltwo.linkedListTwo.reverseLlIterative;

public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){

		LinkedListNode<Integer> t1 = null, t2 = head, t3 = null;
		
		while(t2 != null) {
			t3 = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = t3;
		}
		return t1;		
	}
}