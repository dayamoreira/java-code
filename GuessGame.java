import java.util.random.*;
import java.util.Scanner;

class GuessGame {
 
    public static void main(String[] args) {
    
        Scanner people = new Scanner(System.in);
        int myNum = (int) (Math.random()*100);

        System.out.println(myNum);

        System.out.println("Choose a Number between 0-99");
        people.nextInt();
        System.err.println("it's a wrong number, try again: ");
        people.nextInt();
        

        people.close();  

          }
}
