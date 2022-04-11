package souvik.lvltwo.linkedListOne.lengthOfLinkedListRecursive;

public class Solution {

	public static int length(LinkedListNode<Integer> head){
        if(head == null) {
            return 0;
        }
        int sa = length(head.next);
        return sa + 1;
	}
}
