package javatask7;

import java.util.ArrayList;
import java.util.List;

public class Question5Arraylist {

	public static void main(String[] args) {
		arraylist();
	}
public static void arraylist() {
	List<String> mylist=new ArrayList<>();
	mylist.add("A");
	mylist.add("B");
	mylist.add("H");
	mylist.add("K");
	mylist.add("E");
	mylist.add("G");
	mylist.add("L");
	mylist.add("P");
	mylist.add("V");
	mylist.add("Z");
	mylist.add("N");
	mylist.add("C");
	System.out.println("MyList Size is -- "+mylist.size());
	System.out.println("MyList Elements are -- "+mylist);
	mylist.remove(3);
	System.out.println("MyList Size after removing index 3 is  -- "+mylist.size());
	System.out.println("MyList Elements are after removing index 3 are -- "+mylist);
	mylist.remove("C");
	System.out.println("MyList Size after removing Object C is  -- "+mylist.size());
	System.out.println("MyList Elements are after removing Object C are -- "+mylist);
	
	mylist.remove("W");
	System.out.println("MyList Size after removing Object W(not in Array) is  -- "+mylist.size());
	System.out.println("MyList Elements are after removing Object W(not in Array) are -- "+mylist);
	mylist.removeAll(mylist);
	System.out.println("Array List after removing all elements  "+mylist);
}
}
