public class Example1 {
	public interface Function<F, T> {
		T apply(F from);
	}

	public static void main(String[] args) {
		Function<Integer, String> intToString = new Function<Integer, String>() {
			@Override
			public String apply(Integer from) {
				return from.toString();
			}
		};

		System.out.println(intToString.apply(100)); // подаём число, получаем строку
	}
}

