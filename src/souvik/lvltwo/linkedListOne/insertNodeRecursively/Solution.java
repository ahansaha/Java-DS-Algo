package souvik.lvltwo.linkedListOne.insertNodeRecursively;

public class Solution {

	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
        if(head == null) {
        	if(pos == 0) {  //Means linkedList is empty and insertion has to be done at zeroth position which is possible.
                LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(data);
                newHead.next = null;
                return newHead;
            }
        	return head;
        }
        
        if(pos == 0) { //Means linkedList is NOT empty but insertion can still be done at zeroth position.
            LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(data);
            newHead.next = head;
            return newHead;
        }
        
        LinkedListNode<Integer> temp = insertR(head.next, data, pos - 1);
        head.next = temp;
        return head;
	}
}
