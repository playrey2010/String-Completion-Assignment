import java.util.Scanner;

public class PetQuestions {

    public static void main(String[] args) {
        String name;
        String breed;
        int age;

        Scanner keyboard = new Scanner(System.in);
        // Changed both keyboard methods to nextLine for breed name's with spaces (miniature schauzer, great Dane)
        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.nextLine();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.nextLine();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();

        System.out.println( name + " is your " + breed + " and it is " + age + " years old." );
    }
}
