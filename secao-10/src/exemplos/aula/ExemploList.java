package exemplos.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //Adiciona na posição específica

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("\n------------");
//		list.remove(1); //Remove da lista o objeto escolhidp
		list.removeIf(x -> x.charAt(0) == 'M'); //Remove da lista todos os objetos que iniciam com a letra escolhida

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("\n------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //Diz qual é a posição do elemento na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // Quando não encontra o elemento, retorna -1

		System.out.println("\n------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Filtra pela primeira letra escolhida

		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("\n------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //Filtra e encontra o primeiro item da lista com a letra escolhida
		System.out.println(name);
	}
}
