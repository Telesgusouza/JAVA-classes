package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("alex");
		list.add("bob");
		list.add("anna");
		list.add(2, "Gustavo");
		
		System.out.println(list.size());
		System.out.println(list.indexOf("bob"));
		
		list.remove("anna");
		list.remove(1);
		//list.removeIf(x -> x.charAt(0) == "M");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		
		
	}

}
