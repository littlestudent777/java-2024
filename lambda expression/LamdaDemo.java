interface NumericTest {
    boolean test(int n, int m);
}

public class LamdaDemo {
    public static void main(String[] args) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("10 делится на 2");

        if(!isFactor.test(10, 3))
            System.out.println("10 не делится на 3");
        System.out.println();

        NumericTest lessThan = (n, m) -> (n < m);

        if(lessThan.test(2, 10))
            System.out.println("2 меньше 10");
        if(!lessThan.test(10, 2))
            System.out.println("10 не меньше 2");
        System.out.println();


        if(isFactor.test(10,5))
            System.out.println("10 делится на 5");

        isFactor = (n, m) -> (n > m);;

        if(isFactor.test(10, 5))
            System.out.println("10 больше 5");
    }
}
