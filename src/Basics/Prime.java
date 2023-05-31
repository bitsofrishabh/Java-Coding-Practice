package Basics;

public class Prime {
    public static void main(String[] args) {
           checkPrime(47);
    }
    public static void checkPrime(int number) {
        boolean flag = false;
        for (int i = 2; i < number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
}
