package ch.fhnw.algd2.collections.list.linkedlist;

import java.util.Arrays;

import ch.fhnw.algd2.collections.list.MyAbstractList;

public class MyLinkedList<E> extends MyAbstractList<E> {
	private int size = 0;
	private Node<E> first;

	@Override
	public boolean add(E e) {
		// TODO implement this operation (part A)
		// Frage: wie ist die Liste, wenn es initialisiert ist? null werde? Oder entstehen die Nodes erst bei der zuweiseung?
		// Antwort: Der head-Verweis auf null initialisiert, wenn Sie eine neue Instanz der LinkedList-Klasse erstellen.
		// Es werden jedoch keine Knoten erstellt, bis Sie Elemente zur Liste hinzufügen.
		// Das bedeutet, dass die Liste beim Initialisieren null ist, da sie noch keine Elemente enthält.
		// Erst wenn Sie die add()-Methode aufrufen und ein Element hinzufügen,
		// wird ein neuer Knoten erstellt und der head-Verweis entsprechend aktualisiert.
		// Jedes Mal, wenn Sie ein weiteres Element hinzufügen, wird ein neuer Knoten erstellt und an das Ende der Liste angehängt.

		if(first != null) { // Wenn first null ist, Element in dieser Stelle einfügen.
			Node<E> current = first;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node<>(e);
		} else {
			first = new Node<>(e);
		}
		size++;
		return true;
	}

	@Override
	public boolean contains(Object o) {
		// TODO implement this operation (part B)
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object o) {
		// TODO implement this operation (part C)
		throw new UnsupportedOperationException();
	}

	@Override
	public E get(int index) {
		// TODO implement this operation (part D)
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(int index, E element) {
		// TODO implement this operation (part D)
		throw new UnsupportedOperationException();
	}

	@Override
	public E remove(int index) {
		// TODO implement this operation (part D)
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size];
		int index = 0;
		Node<E> current = first;
		while (current != null) {
			array[index++] = current.elem;
			current = current.next;
		}
		return array;
	}

	@Override
	public int size() {
		return size;
	}

	private static class Node<E> {
		private final E elem;
		private Node<E> next;

		private Node(E elem) {
			this.elem = elem;
		}

		private Node(E elem, Node<E> next) {
			this.elem = elem;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(Arrays.toString(list.toArray()));
	}
}
