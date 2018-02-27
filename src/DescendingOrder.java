import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DescendingOrder {

	ArrayList<Integer> list = new ArrayList<Integer>();

	Comparator<Integer> comparator = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 + o1;
		}
	};

	public int sortDesc(final int num) {

		int length = String.valueOf(num).length();
		int wynik = 0;

		for (int i = 0; i < length; i++) {
			list.add(Character.digit(String.valueOf(num).charAt(i), 10));
		}

		Collections.sort(list, comparator);

		for (int i = 0; i < length; i++) {
			wynik = wynik * 10 + list.get(i);
		}

		return wynik;
	}
}