package souvik.lvltwo.linkedListOne.deleteNode;

public class Solution {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
	    int idx = 0;
        LinkedListNode<Integer> temp = head;
        
        while(temp != null) {
            if(idx == pos && idx == 0) {
                head = head.next;
                temp.next = null;
                return head;
            }
            else if(idx == pos - 1 && head.next.next == null) {
                temp.next = null;
                return head;
            }
            else if(idx == pos - 1 && temp.next != null) {
                LinkedListNode<Integer> t1 = temp.next;
                temp.next = temp.next.next;
                t1.next = null;
                return head;
            }
            temp = temp.next;
            idx++;
        }

        return head;
	}
}
