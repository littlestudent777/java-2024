interface MyFunc {
    int func(int n);
}

public class LamdaDemo1 {
    public static void main(String[] args) {
        int num = -1;
        int num1=10;
        MyFunc myFunc = (n) -> {
            int result = num;
            System.out.println(num);
            if (n < 0)
                n = -n;

            for (int i=2; i <= n/i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };

        System.out.println("Наименьший делить 12 "
                + myFunc.func(12));
        num1=20;
        System.out.println("Наименьший делить 13 "
                + myFunc.func(13));
    }
}
