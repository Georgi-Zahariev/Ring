
public class test {

	public static void main(String[] args) {

		Ring<Integer> r = new Ring<Integer>(4);
		r.add(3);
		r.add(7);
		for (int i = 10; i <= 20; i++)
			r.add(i);
		System.out.println(r.toString());
		do {
			try {
				r.remove();
				System.out.println(r.toString());
			} catch (Exception e) {
				break;
			}
		} while (true);
	}
}
