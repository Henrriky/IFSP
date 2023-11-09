package SEMANA9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

public class Programa {

	public static void main(String[] args) {
		
		/*
		Collection<String> lista = new ArrayList<String>();
		lista.add("Lista");
		lista.add("sao");
		lista.add("melhores");
		lista.add("sla");
		
		lista.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return true;
			}
		}); */
		
		
		/*
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
		}
		for (Iterator<String> iterator2 = lista.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
		}
		*/
		
		
		Queue<String> lista = new PriorityQueue<String>(
				new Comparator<String>() {
					public int compare(String o1, String o2) {
						return o1.length() > o2.length() ? 1 : -1;
					};
				}
		);
		
		
		lista.add("Lista");
		lista.add("sao");
		lista.add("melhores");
		lista.add("sla");
		
		
		
	}
	
}
