package Task03;

public class Main {

    public static void main(String[] args) {

        int num = 6;
        int sum = 0;
        int index = 1;

        while (num > 0) {
            sum += num;
            System.out.println(index + ") Num is " + num + ", sum is " + sum);
            index += 1;
            num -= 1;
        }

        System.out.println("-----------------------\n" +
                "Sum of numbers is " + sum);
    }
}

