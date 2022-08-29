public class Main {
    public static void main(String[] args) {
        int number = 97;
        boolean prime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            else
                prime = true;
        }
        if (prime)
        System.out.println(number + " is a prime number");
        else
        System.out.println(number + " is not a prime number");
    }
}