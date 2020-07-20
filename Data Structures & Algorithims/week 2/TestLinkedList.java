class TestLinkedList {

	public static void main(String args[])
	{

		ListReferenceBased myList = new ListReferenceBased();

		myList.add(1,101);
		myList.add(2,10);
		myList.add(3,40);
		myList.add(4,20);

		System.out.println(myList.get(3));

		myList.displayList();
		System.out.println("Largest list item is :" + myList.listLargest());

	}
}
