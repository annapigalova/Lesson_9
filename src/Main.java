
public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> testList = new LinkedList<>();

		testList.addToTail(1);
		testList.addToHead(2);
		testList.addToHead(6);
		testList.addToTail(3);
		testList.addToHead(45);
		testList.addToPos(14, 2);
		testList.addToHead(6);
		
		testList.printLinkedList();
		System.out.println();
		
		if (testList.containElement(21)) {
			System.out.println("Element exists");
		} else {
			System.out.println("Element doesn't exists");
		}

		testList.removeElement(6);
		testList.removeElement(3);
		testList.addToTail(666);
		testList.removeElement(14);
		
		testList.printLinkedList();
		System.out.println();
	}

}
