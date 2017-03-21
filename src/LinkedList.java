
public class LinkedList<T> {
	private Element<T> head;
	private Element<T> tail;
	private Element<T> element;
	private int size = 0;

	public void addToHead(T item) {
		Element<T> a = new Element<T>();
		a.item = item;

		if (head == null) {

			head = a;
			tail = a;

		} else {
			a.next = head;
			head = a;
		}
		size += 1;

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
		size += 1;
	}

	public void addToPos(T item, int position) {

		Element<T> node = head;

		if (position > size - 1) {
			System.out.println("Incorrect position! ");
		} else if (position == 0) {
			addToHead(item);
		} else if (position == size - 1) {
			addToTail(item);
		} else {
			for (int i = 0; i < position; i++) {
				node = node.next;
			}
			Element<T> a = new Element<T>();
			a.item = item;

			node = a.next;
			//element.next = node;
			element = a;
			element.next =  a.next;;
			  

			size += 1;

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
