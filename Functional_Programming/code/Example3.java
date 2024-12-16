import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Example3 {
	public interface Function<F, T> {
		T apply(F from);
	}
	
	public interface Predicate<T> {
		boolean test(T t);
	}

	public static <T> ArrayList<T> filter(Collection<T> from, Predicate<T> check) {
		ArrayList<T> result = new ArrayList<T>();
		for (T element : from) {
			if (check.test(element))
				result.add(element);
		}
		return result;
	}

	static Predicate<Integer> is_odd = new Predicate<Integer>() { 
		@Override
		public boolean test(Integer t) {
			return (t % 2 != 0);
		}
	};
	
	public static ArrayList<Integer> filterOddNumbers(ArrayList<Integer> numbers) {
		return filter(numbers, is_odd);
	}

	
	public static void main(String[] args) {
		ArrayList<Integer> some_nums = new ArrayList<Integer>();
		some_nums.add(1);
		some_nums.add(2);
		some_nums.add(3);
		some_nums.add(4);
		some_nums.add(5);
		System.out.println("before filtering: ");
		for (int i = 0; i < some_nums.size(); i++) {
			System.out.print(some_nums.get(i) + " ");
		}
		System.out.println();

		some_nums = filterOddNumbers(some_nums);

		System.out.println("after filtering: ");
		for (int i = 0; i < some_nums.size(); i++) {
			System.out.print(some_nums.get(i) + " ");
		}
		System.out.println();
	}		
}
