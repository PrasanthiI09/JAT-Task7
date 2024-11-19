package javatask7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Question6Treemap {

	public static void main(String[] args) {
		treemapofemployess();
	}
	public static void treemapofemployess() {
	
		Map<Integer,String> mytreemap=new TreeMap<>();
		mytreemap.put(12,"Prasanthi");
		mytreemap.put(10, "Indra");
		mytreemap.put(9, "Padma");
		mytreemap.put(7, "Aravind");
		mytreemap.put(1, "Swathi");
		mytreemap.put(3, "Rishu");
		System.out.println("TreeMap Values are -- ");
		System.out.println(mytreemap);
		List<String> mylist=new ArrayList<>(mytreemap.values());
		System.out.println("Array Values are before sorting -- ");
		System.out.println(mylist);
		System.out.println("Array Values are after sorting -- ");
	Collections.sort(mylist);
	System.out.println(mylist);
	}
}
