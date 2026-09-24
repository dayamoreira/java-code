
public class udemyProjeto1 {

    public static void main(String[] args) {
        String name = "Dayane";
        int yearBird = 1992;
        int yearNow = 2026;
        double BDay = (double) yearNow - yearBird;
        System.out.println("A idade de " + name + " e: " + BDay + " anos de vida!\n");
        System.out.printf("A idade de %s e: %.1f anos de vida!%n", name, BDay);

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);

    }
}