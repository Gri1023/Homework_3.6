public class Main {
    public static void main(String[] args) {
        int number = 97;
        boolean prime = false;
        // method using for
        for (int i = 2; i < number; i++) {
           if (number % i == 0) {
                prime = false;
                 break;
            }
            else
                prime = true;
        }
        if (prime)
            System.out.println(number + " is a prime number; used for method");
        else
            System.out.println(number + " is not a prime number; used for method");
        // method using while
        int n = 2;
        boolean prime2 = false;
        while (n<number)
        {
            if (number % n == 0) {
            prime2 = false;
            n++;
        }
            else
            prime2 = true;
            break;
        }

        if (prime2)
        System.out.println(number + " is a prime number; used while method");
        else
        System.out.println(number + " is not a prime number; used while method");
    }
}