package souvik.lvltwo.linkedListOne.eliminateDuplicates;

public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		
		//SOLUTION SEEMS TO BE CORRECT. TEST CASES SEEM TO BE INVALID
        
        LinkedListNode<Integer> temp = head;
		
		while(temp != null && temp.next != null) {
			
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}
			else {
				temp = temp.next;
			}
		}
		
		return head;
	}
}	
