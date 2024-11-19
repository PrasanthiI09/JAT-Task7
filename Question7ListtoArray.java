package javatask7;

import java.util.ArrayList;

public class Question7ListtoArray {

	public static void main(String[] args) {
		listtoarray();
	}
public static void listtoarray() {
	
	ArrayList<String> myarray=new ArrayList<>();
	String[] array = {"Apple","Mango","Tree","Banana","Orange"};
	myarray.add("Prasanthi");
	myarray.add("Saroja");
	myarray.add("Sudha");
	myarray.add("Sowmya");
	myarray.add("Aravind");
	System.out.println("ArraylistSize is -- "+myarray.size());
	System.out.println(" And Arraylist values are -- "+myarray);
	System.out.println("Array Values are -- ");
	for(int i =0;i<array.length;i++) {
	
	System.out.println(array[i]);}
	System.out.println("Array Values after replacing with List values are -- ");
	for(int i=0;i<myarray.size();i++) {
		
		array[i]=myarray.get(i);
		System.out.println(array[i]);	
	}
	
	}
	
	
}

