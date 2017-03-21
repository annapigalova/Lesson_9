
public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> ml = new LinkedList<>();
		ml.addToTail(1);
		ml.addToHead(2);
		ml.addToHead(6);
		ml.addToTail(3);
		ml.addToHead(45);
		ml.addToPos(14, 2);

		ml.printLinkedList();
		System.out.println();
	}

}
