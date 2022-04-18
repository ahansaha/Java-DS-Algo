package souvik.lvltwo.linkedListTwo.midpoint;

public class Solution {
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head, fast = head;

        while(head != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
