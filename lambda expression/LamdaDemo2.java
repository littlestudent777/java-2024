interface SomeTest<T> {
    boolean test(T n, T m);
}

public class LamdaDemo2 {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("10 делится на 2");
        System.out.println();

        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if (isFactorD.test(212.0, 4.0))
            System.out.println("212.0 делится на 4.0");
        System.out.println();

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        if (isIn.test("faceID", "face"))
            System.out.println("'face' найдено в 'faceID'");
    }
}
