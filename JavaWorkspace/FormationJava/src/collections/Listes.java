package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Listes {

	// ArrayList stocke les éléments de la liste sous la forme de blocs en mémoire. 
	// très performante pour les accès aléatoire en lecture aux éléments de la liste. 
	// Par contre, les opérations d’ajout et de suppression d’un élement se font en temps linéaire. 
	// Elle est donc moins performante que la classe LinkedList sur ce point.
	
	public static void main(String[] args) {
		
		System.out.println("-----Array List-----");
		List<String> liste = new ArrayList<String>();
		liste.add("my first element");
		liste.add("my second element");
				
		liste.add(1, "insterted element at position 1");
	
		System.out.println(liste);
	
		for (String s : liste) {
			System.out.println(s);
		}
		
		String firstElement = liste.get(0);
		System.out.println("first element: " + firstElement);

		System.out.println("Does 'liste' contains 'my first element' ? : " + liste.contains("my first element"));
		
		System.out.println("Does 'liste' contains 'my third element' ? : " + liste.contains("my third element"));

		liste.remove(1);
		
		liste.addAll(Arrays.asList("my third element", "my fourth element"));
		
		System.out.println(liste);

		System.out.println("Longeur de la liste: "+ liste.size());
		
		// ----------------------------------------------------------------------------------------------------------------
		// Il est possible de réserver de l’espace mémoire pour une liste pouvant contenir n éléments. 
		// Pour cela, on peut passer la taille voulue à la création d’une instance de ArrayList ou en appelant la méthode ArrayList.ensureCapacity. 
		// La liste ne change pas de taille pour autant, un espace mémoire est simplement alloué en prévision.
		ArrayList<String> listeTaillée = new ArrayList<String>(5);
		
		listeTaillée.addAll(Arrays.asList("elem1", "elem2", "elem3", "elem4", "elem5", "elem6" ));

		// listeTaillée.ensureCapacity(100);
		for(String s: listeTaillée) {
			System.out.println(s);
		}
		
		// ----------------------------------------------------------------------------------------------------------------
		// LinkedList : liste doublement chainée, très performante pour l'insertion et la supression des données
		// mais moins performante que ArrayList pour la lecture des éléments, qui se fait en temps linéare
		
		System.out.println("la taille de 'listeTaillée : "+listeTaillée.size());
		
		

		System.out.println("-----Linked List-----");
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("fisrt element in linked list");
		linkedList.add("second element in linked list");
		

		linkedList.add(1, "une seconde chaîne");
		
		System.out.println(linkedList);
		System.out.println(linkedList.size()); // 2
		for (String s : linkedList) {
		  System.out.println(s);
		}
		
		// ----------------------------------------------------------------------------------------------------------------
		// Queue et Deque : implémentations de LinkedList pour la répresentation des structures LIFO, FIFO

		System.out.println("-----Queue-----");
		Queue<String> queue =  new LinkedList<String>();
		// insère un élément dans la file
		queue.offer("un élément");

		// lit l'élément en tête de la file sans l'enlever de la file
		System.out.println(queue.peek()); // "un élément"
		// lit l'élément en tête de la file et l'enleve de la file
		System.out.println(queue.poll()); // "un élément"

		System.out.println(queue.isEmpty()); // true
		

		System.out.println("-----Deque-----");
		Deque<String> deque = new LinkedList<String>();

		// empile deux éléments
		deque.push("élément 1");
		deque.push("élément 2");

		// lit le premier élément de la file sans l'enlever
		System.out.println(deque.peekFirst()); // élément 2
		// lit le dernier élément de la file sans l'enlever
		System.out.println(deque.peekLast()); // élément 1
		// lit l'élément de tête de la file sans l'enlever
		System.out.println(deque.peek()); // élément 2
		// lit l'élément de tête de la file et l'enlève
		System.out.println(deque.pop()); // élément 2
		System.out.println(deque.pop()); // élément 1

		System.out.println(deque.isEmpty()); // true
		
		
		
	}

}
