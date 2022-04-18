package souvik.lvltwo.linkedListTwo.reverseLlRecursive;


//SIMPLE RECURSIVE APPROACH -> O(N^2)

//public class Solution {
//
//	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
//		
//		if(head == null || head.next == null) {
//			return head;
//		}
//		
//		LinkedListNode<Integer> newHead = reverseLinkedListRec(head.next);
//		
//		LinkedListNode<Integer> temp = newHead;
//		while(temp.next != null) {
//			temp = temp.next;
//		}
//		temp.next = head;
//		head.next = null;
//		return newHead;
//	}
//
//}


//MODIFIED RECURSIVE APPROACH AFTER MAINTAINING A TAIL POINTER ALONG WITH HEAD -> O(N)

class Pointers<T>{
	public LinkedListNode<T> head = null;
	public LinkedListNode<T> tail = null;
}

public class Solution {

	public static Pointers<Integer> reverseLinkedListRecHelper(Pointers<Integer> llPointers) {
		
		if(llPointers.head == null || llPointers.head.next == null) {
			return llPointers;
		}
		
		LinkedListNode<Integer> originalHead = llPointers.head;
		llPointers.head = llPointers.head.next;
		Pointers<Integer> newLlPointers = reverseLinkedListRecHelper(llPointers);
		
		newLlPointers.tail.next = originalHead;
		originalHead.next = null;
		newLlPointers.tail = originalHead;
		
		return newLlPointers;
	}
	
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		
		LinkedListNode<Integer> temp = head;
		while(temp != null && temp.next != null) {
			temp = temp.next;
		}
		LinkedListNode<Integer> tail = temp;
		
		Pointers<Integer> llPointers = new Pointers<>();
		llPointers.head = head;
		llPointers.tail = tail;
		
		return reverseLinkedListRecHelper(llPointers).head;
	}

}
