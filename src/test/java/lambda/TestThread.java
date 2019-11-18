package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestThread {
	
	public static void main(String[] args) {
		Consumer<ArrayList<Integer>> thread = list -> {
			ArrayList<Integer> list;
			int[] arr = new int[list.size()];
			Thread t = new Thread(() -> {
				
				
				
				int i = 0;
				while(i < list.size()) {
					arr[i] = list.get(i);
					i++;
				}
			});
			t.start();
		

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Thread t = new Thread(() -> {
			list.forEach( i -> arr.add(i));
		});
		t.start();
		t.join();
		return arr.toArray();	
	}
	
	Consumer<ArrayList<Integer>> threadPerform = list -> {
		int[] arr = new int[list.size()];
		Thread t = new Thread(() -> {
			
			
			
			int i = 0;
			while(i < list.size()) {
				arr[i] = list.get(i);
				i++;
			}
		});
		t.start();
	}

}
