package souvik.lvltwo.linkedListOne.lengthOfLL;

public class Solution {

    public static int length(LinkedListNode<Integer> head){
		int c = 0;
		while(head != null) {
			head = head.next;
			c++;
		}
		return c;
	}
}