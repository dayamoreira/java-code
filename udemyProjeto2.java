public class udemyProjeto2 {
   public static void main(String[] args) {
    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.printf(" Products:%n %s, which price is $%.2f%n %s, which price is $%.2f%n %n Record: %d years old, code %d and gender: %c%n %n Measue with eith decimal place: %.8f%n Rouded (tree decimal place): %.3f%n Us decimal point: %.3f.%n %n%n", 
    product1, 
    price1, 
    product2, 
    price2,
    age, 
    code, 
    gender,
    measure,
    measure,
    measure);
   } 
}
