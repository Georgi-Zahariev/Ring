
public class Ring<T> {
	private class Node {
		T data;
		Node next;
	}

	private Node first;

	public Ring() {
		first = null;
	}

	public Ring(T a) {
		first = new Node();
		first.data = a;
		first.next = first;
	}

	public T getFirst() throws NullPointerException {
		if (first == null)
			throw new NullPointerException();
		return first.data;
	}

	public void setFirst(T f) throws NullPointerException {
		if (first == null)
			throw new NullPointerException();
		first.data = f;
	}

	public String toString() {

		String s = "{";
		boolean b = false;
		Node p = first;
		while (p != null) {
			if (b)
				s = s + ",";
			s = s + p.data.toString();
			b = true;
			p = p.next;
			if (p == first)
				break;
		}
		s = s + "}";
		return s;
	}

	public void add(T a) {
		Node p = first;
		first = new Node();
		first.data = a;
		first.next = p.next;
		p.next = first;
	}

	public boolean findFirstVal(T v) {
		Node p = first;
		if (first == null)
			return false;
		do {
			if (first.data == v) {
				return true;
			}
			first = first.next;
		} while (first != p);
		return false;
	}

	public boolean findLastVal(T v) {
		Node p = first, q = first;
		boolean b = false;
		if (p == null)
			return false;
		do {
			if (first.data == v) {
				q = first;
				b = true;
			}
			first = first.next;
		} while (first != p);
		first = q;
		return b;
	}

	public void remove() throws NullPointerException {
		if (first == null)
			throw new NullPointerException();
		if (first.next == first) {
			first = null;
			return;
		}
		Node p = first, q;
		do {
			q = p;
			p = p.next;
		} while (p != first);
		q.next = first.next;
		first = first.next;
	}

}
