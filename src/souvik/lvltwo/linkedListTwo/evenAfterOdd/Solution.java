package souvik.lvltwo.linkedListTwo.evenAfterOdd;

//My original solution

//public class Solution {
//
//	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
//		
//		//fon - first odd node, fen - first even node, on - odd node, en - even node, lon last odd node.
//		
//		LinkedListNode<Integer> fon = null, fen = null, on = null, en = null, temp = head, lon = null;
//		
//		while(temp != null && temp.next != null) {
//			
//			if(temp.data % 2 == 0) {
//				
//				if(fen == null) {
//					fen = temp;
//				}
//				if(temp.next.data % 2 == 0) {
//					temp = temp.next;
//				}
//				else {
//					en = temp;
//					if(on != null) {
//						on.next = temp.next;
//						on = null;
//					}
//					temp = temp.next;
//				}
//			}
//			else {
//				
//				lon = temp;	
//				
//				if(fon == null) {
//					fon = temp;
//				}
//				if(temp.next.data % 2 != 0) {
//					temp = temp.next;
//					lon = temp;
//				}
//				else {
//					on = temp;
//					if(en != null) {
//						en.next = temp.next;
//						en = null;
//					}
//					temp = temp.next;
//				}
//			}
//		}
//		
//		if(en != null) {
//			en.next = null;
//		}
//		if(on != null) {
//			on.next = null;
//		}
//		
//		
//		if(lon != null) {
//			lon.next = fen;
//		}
//		
//		if(fon != null) {
//			return fon;
//		} 
//		else {
//			return fen;
//		}
//	}
//}

//Better solution, although time complexity wise both are same.

public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		
		LinkedListNode<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null, temp = head;
		
		while(temp != null) {
			
			if(temp.data % 2 == 0) {
				
				if(evenHead == null) {
					evenHead = temp;
					evenTail = temp;
				}
				else {
					evenTail.next = temp;
					evenTail = temp;
				}
				
			}
			else {
				
				if(oddHead == null) {
					oddHead = temp;
					oddTail = temp;
				}
				else {
					oddTail.next = temp;
					oddTail = temp;
				}
			}
			
			temp = temp.next;
		}
		
		if(oddTail != null) {
			oddTail.next = null;
		}
		if(evenTail != null) {
			evenTail.next = null;
		}
		
		if(oddHead == null) {
			return evenHead;
		}
		else if(evenHead == null) {
			return oddHead;
		}
		
		oddTail.next = evenHead;
		return oddHead;
	}
}
