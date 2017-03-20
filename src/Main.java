
public class Main {

	public static void main(String[] args) {
		LinkedList<Object> ml = new LinkedList<>();
		ml.addToTail(1.0);
		ml.addHead(2);
		ml.addHead("brrr");
		ml.addHead(6);
		ml.addToTail(3.0);
		ml.addHead(45);

		ml.printLinkedList();
		System.out.println();
	}

}
