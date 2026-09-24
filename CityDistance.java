import java.util.Scanner;

public class CityDistance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] cities = {
            "Boston",
            "Chicago",
            "Atlanta",
            "Paris"
        };

        int[][] distances = {
            {0, 983, 1078, 3448},
            {983, 0, 716, 4152},
            {1078, 716, 0, 4385},
            {3448, 4152, 4385, 0}
        };

        System.out.println("Choose a starting city:");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(i + ": " + cities[i]);
        }

        int start = scan.nextInt();

        System.out.println("Choose a destination city:");
        int destination = scan.nextInt();

        int distance = distances[start][destination];

        System.out.println(
            "The distance from " +
            cities[start] +
            " to " +
            cities[destination] +
            " is " +
            distance +
            " miles."
        );

        scan.close();
    }
}