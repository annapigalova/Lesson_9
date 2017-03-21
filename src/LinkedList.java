
public class LinkedList<T> {
	private Element<T> head;
	private Element<T> tail;

	private int size = 0;

	public void addToHead(T item) {
		Element<T> j = new Element<T>();
		j.item = item;

		if (head == null) {

			head = j;
			tail = j;

		} else {
			j.next = head;
			head = j;
		}
		size += 1;

	}

	public void addToTail(T item) {
		Element<T> j = new Element<T>();
		j.item = item;

		if (tail == null) {
			head = j;
			tail = j;
		} else {
			tail.next = j;
			tail = j;
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
			for (int i = 0; i < position - 1; i++) {
				node = node.next;
			}
			Element<T> j = new Element<T>();
			j.item = item;

			j.next = node.next; // define next value of the inserted element
			node.next = j; // inserted element

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

	public void removeElement(T item) {

		if (containElement(item)) {
			if (head == tail) {
				head = null;
				tail = null;

			} else {
				Element<T> node = head;
				Element<T> prevNode = head;

				if (item.equals(head.item)) {
					head = head.next;
				}

				while (node != null) {

					if (item.equals(node.item)) {
						if (node == tail) {
							tail = prevNode;
						}

						prevNode.next = node.next;
					}

					prevNode = node;
					node = node.next;

				}

			}

		}

	}

	public boolean containElement(T item) {
		Element<T> node = head;
		Element<T> j = new Element<T>();
		j.item = item;

		while (node != null) {
			if (j.item.equals(node.item)) {
				return true;
			}
			node = node.next;
		}

		return false;

	}

	private static class Element<T> {

		private Element<T> next;
		private T item;

	}

}
