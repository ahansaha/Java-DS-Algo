package souvik.lvltwo.linkedListTwo.mergeTwoSortedLL;

public class Solution {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }

        LinkedListNode<Integer> newHead = null;
        if(head1.data <= head2.data) {
            newHead = head1;
        }
        else {
            newHead = head2;
        }

        LinkedListNode<Integer> t1 = head1, t2 = head2, temp = null;

        while(t1 != null && t2 != null) {
        	
            if(t1.data <= t2.data) {
            	
            	if(t1.next != null && t1.next.data <= t2.data) {
            		t1 = t1.next;
            	}
            	else {
            		temp = t1;
            		t1 = t1.next;
            		temp.next = t2;
            	}
            }
            else {
            	
            	if(t2.next != null && t2.next.data < t1.data) {
            		t2 = t2.next;
            	}
            	else {
            		temp = t2;
            		t2 = t2.next;
            		temp.next = t1;
            	}
            }
        }

        return newHead;
    }

}
