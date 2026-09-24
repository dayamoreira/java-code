    import java.util.Scanner;

public class udemyProjeto3 {
    public static void main(String[] args) {
        Scanner test = new Scanner (System.in);
        
        System.out.print ("Qual o seu nome: "); 
        String name = test.next();

        System.out.print ("Qual o seu ano de nascimento: "); 
        int yearBird = test.nextInt();

        System.out.print ("Em que ano estamos hj: "); 
        int yearNow = test.nextInt();

        System.out.print ("Qual a sua autura: "); 
        double autura = test.nextDouble();

            int idade = yearNow - yearBird;


        System.out.printf ("\nPrazer em conhecer voce %s%n"
            + "Voce tem hoje %d anos de vida!%n"
            + "Sua autura e: %.2fm%n"
            + "Gosto muito de ter vc aqui :)%n%n",
        name, 
        idade,
        autura);








        test.close();

    }
}
