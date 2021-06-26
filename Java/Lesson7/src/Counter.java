
public class Counter {
	static int count = 0; // se lay bo nho khi instance dc tao ra.
	public Counter() {
		count++;
		System.out.println(count);
	}
}
