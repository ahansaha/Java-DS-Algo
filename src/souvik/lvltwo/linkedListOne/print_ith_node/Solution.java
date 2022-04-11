package souvik.lvltwo.linkedListOne.print_ith_node;

public class Solution {
    
	public static void printIthNode(LinkedListNode<Integer> head, int givenIdx){
		int myIdx = 0;
        while(head != null) {
        	if(myIdx == givenIdx) {
        		System.out.println(head.data);
        		return;
        	}
        	head = head.next;
        	myIdx++;
        }
	}
}
