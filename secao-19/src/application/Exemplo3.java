package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Exemplo3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStr);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
