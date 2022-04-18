package souvik.lvltwo.linkedListOne.palindrome;

public class Solution {
	
	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head, fast = head;

        while(head != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
	
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

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		
		if(head == null || head.next == null) {
			return true;
		}
		
		LinkedListNode<Integer> midNode = midPoint(head);
		LinkedListNode<Integer> head2 = midNode.next;
		midNode.next = null;
		head2 = reverse_I(head2);
		
		LinkedListNode<Integer> t1 = head, t2 = head2;
		
		while(t1 != null && t2 != null) {
			if(t1.data != t2.data) {
				return false;
			}
			t1 = t1.next;
			t2 = t2.next;
		}
		return true;
	}
}



































