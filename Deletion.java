public class deletion {

    static void printLL(Node<Integer> head) {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data+" -> ");
			cur = cur.next;
		}
		System.out.println("end");
	}

    static Node<Integer> deleteLL(int position, Node<Integer> head) {
		if(head == null) return null;
		if(position == 0) {
			head = head.next;
			return head;
		}
		Node<Integer> cur = head;
		for(int i = 0; i<position-1; i++) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		return head;
	}

    public static void main(String[] args) {
		
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);

		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

				
		printLL(head);

		head = deleteLL(3, head);
		printLL(head);
		
		
		
	}
}
class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
}
