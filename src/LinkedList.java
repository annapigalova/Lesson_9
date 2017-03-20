
public class LinkedList<T> {
	private Element<T> head;
	private Element<T> tail;

	public void addHead(T item) {
		Element<T> a = new Element<T>();
		a.item = item;

		if (head == null) {
			head = a;
			tail = a;
		} else {
			a.next = head;
			head = a;

		}

	}

	public void addToTail(T item) {
		Element<T> a = new Element<T>();
		a.item = item;

		if (tail == null) {
			head = a;
			tail = a;
		} else {

			tail.next = a;
			tail = a;
		}
	}

	public void printLinkedList() {
		Element<T> node = head;

		while (node != null) {
			System.out.println(node.item + " ");
			node = node.next;
		}

	}

	private static class Element<T> {

		private Element<T> next;
		private T item;

	}

}
