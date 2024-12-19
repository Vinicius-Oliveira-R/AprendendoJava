public class LinkedListTeste{
	public static void main(String[]args){
	String h1 =  "my";
	String h2 = "favorite";
	String h3 = "book";
	LinkedList<String> linkedList = new LinkedList();
	linkedList.add(h1);
	linkedList.add(h2);
	linkedList.add(h3);
	System.out.println("my list after adding 3 elements: ");
	System.out.println(linkedList);
	System.out.println("element #2 of my list: ");
	System.out.println(linkedList.get(2));
	linkedList.remove(1);
	System.out.println("My list after removing #1: ");
	linkedList.add(1,"frist");
	System.out.println("my list after adding an element in the middle");
}
}