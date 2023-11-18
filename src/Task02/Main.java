package Task02;

public class Main {

    public static void main(String[] arg) {

        int sum = 0;

        for (int i = 1; i <= 10; i += 1) {

            if (i % 3 == 0) {
                sum += i;
                System.out.println(i + ") Num is " + i + ", sum is " + sum);
            }
        }

        System.out.println("-----------------------\n" + "Sum of numbers is " + sum);
    }
}
