import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Example2 {

	public interface Function<F, T> {
		T apply(F from);
	}

	//нефункциональное решение
	public static String joinNumbers(Collection<Integer> numbers) {
		StringBuilder result = new StringBuilder();
		boolean first = true;
		for (Integer number : numbers) {
			if (first)
				first = false;
			else 
				result.append(", ");
			result.append(number);
		}
		return result.toString();
	}

	//функциональное решение
	public static <F, T> List<T> map(Collection<F> from, Function<F, T> transformer) {
		ArrayList<T> result = new ArrayList<T>();
		for (F element : from) 
			result.add(transformer.apply(element));
		return result;
	}

	public static <T> String join(Collection<T> from, String separator) {
		StringBuilder result = new StringBuilder();
		boolean first = true;
		for (T element : from) {
			if (first)
				first = false;
			else 
				result.append(separator);
			result.append(element);
		}
		return result.toString();
	}

	static Function <Integer, String> intToString = new Function<Integer, String>() { 
		@Override
		public String apply(Integer from) {
			return from.toString();
		}
	};

	public static String joinNumbersFunc(Collection<Integer> numbers) {
		return join(map(numbers, intToString), ", "); //получили one-liner
	}


	public static void main(String[] args) {
		ArrayList<Integer> some_nums = new ArrayList<Integer>();
		some_nums.add(1);
		some_nums.add(2);
		some_nums.add(3);
		some_nums.add(4);
		some_nums.add(5);

		String non_func = joinNumbers(some_nums);
		String func = joinNumbersFunc(some_nums);


		System.out.println("non-functional solution: " + non_func);
		System.out.println("functional solution: " + func);
	}

}
