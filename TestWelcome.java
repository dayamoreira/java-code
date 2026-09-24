import java.io.IOException;
import java.util.Scanner;

class GuessGame {

    static final int lower = 0;
    static final int upper = 100;

    static int secret;
    static Scanner scan = new Scanner(System.in);


    public static void setup() {

        secret = (int) (Math.random() * 100);

        System.out.println("Program picked a secret number between 0-99.");
    }


    public static int askGuess() {

        System.out.println("Choose a Number between 0-99");

        if (scan.hasNextInt()) {

            int guess = scan.nextInt();
            scan.nextLine();

            return guess;
s
        } else {

            scan.nextLine();

            return -1;
        }
    }


    public static int tryGuess(int guess) {

        if (guess == secret) {

            System.out.println("got it");
            return 0;

        } else if (guess < secret) {

            System.out.println("too low");
            return -1;

        } else {

            System.out.println("too high");
            return 1;
        }
    }


    public static void main(String[] args) throws IOException {

        setup();

        int result = 1;


        // First try

        int guess = askGuess();

        if (guess == -1) {

            System.out.println("Hey, that's not an int");

        } else {

            result = tryGuess(guess);
        }


        // Second try

        if (result != 0) {

            guess = askGuess();

            if (guess == -1) {

                System.out.println("Hey, that's not an int");

            } else {

                result = tryGuess(guess);
            }
        }


        // Third try

        if (result != 0) {

            guess = askGuess();

            if (guess == -1) {

                System.out.println("Hey, that's not an int");

            } else {

                tryGuess(guess);
            }
        }


        scan.close();
    }
}