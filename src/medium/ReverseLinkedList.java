package medium;

public class ReverseLinkedList {

	class Node {

		Node next;
		int val;

		public Node(int val) {
			this.val = val;
		}
	}

	private void printL(Node head) {
		Node cur = head;

		while (cur != null) {
			System.out.print(cur.val + " -> ");
			cur = cur.next;
		}

		System.out.print(" null \n");
	}

	Node head;

	public void demo() {
		head = new Node(5);
		addAtTail(4);
		addAtTail(3);
		addAtTail(2);
		addAtTail(1);
		printL(head);
		head = reverseList();
		printL(head);
	}

	private void addAtTail(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}

		Node cur = head;

		while (cur.next != null) {
			cur = cur.next;
		}

		cur.next = newNode;
	}

	private Node reverseList() {
		if (head == null) {
			return null;
		}

		if (head.next == null) {
			return head;
		}

		Node prev = head, cur = head.next;
		Node rHead = null;

		while (cur != null) {
			prev.next = rHead;
			rHead = prev;
			prev = cur;
			cur = cur.next;
		}

		prev.next = rHead;
		head = prev;
		return head;
	}

}
