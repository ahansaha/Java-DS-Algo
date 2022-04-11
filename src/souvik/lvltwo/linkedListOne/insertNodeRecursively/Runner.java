package souvik.lvltwo.linkedListOne.insertNodeRecursively;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class Runner {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;
        StringTokenizer tk = new StringTokenizer(br.readLine());
		int data = Integer.parseInt(tk.nextToken());
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = Integer.parseInt(tk.nextToken());
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine().trim());
        while (t != 0){
            LinkedListNode<Integer> head = takeInput();
            String[] strNums = br.readLine().split(" ");
            int pos = Integer.parseInt(strNums[0]);
            int data = Integer.parseInt(strNums[1]);
            LinkedListNode<Integer> ans = Solution.insertR(head , data, pos);
            print(ans);

            t--;
        }

	}
}
