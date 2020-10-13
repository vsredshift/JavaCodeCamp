import java.util.*;

public class OddsandEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's Play a game called \"Odds and Evens\" ");
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();
        if (choice.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked odds! The computer will be evens!");
        } else if (choice.equalsIgnoreCase("E")) {
            System.out.println(name + " has picked evens! The computer will be odds!");
        }
        else {
            System.out.println("Use O for odds or E for evens ");
        }
        for (int i = 1; i < 50;  i++){
                System.out.print("-");
            }
        System.out.println();

        System.out.println("How many fingers do you put out? ");
        int fingers = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " finger(s).");

        for (int i = 1; i < 50;  i++){
            System.out.print("-");
        }
        System.out.println();
        int sum = fingers + computer;
        System.out.println("The sum is: " + fingers + " + " + computer + " = " + sum);

        if (sum % 2 == 0) {
            System.out.println("Evens it is!");
            if (choice.equalsIgnoreCase("E")) {
                System.out.println(name + " wins!");
            }
            else {
                System.out.println("Computer wins!");
                }
            }
        else {
            System.out.println("Odds it is");
        }   if (choice.equalsIgnoreCase("O")) {
                System.out.println(name + " wins!");
        }
            else {
                System.out.println("Computer wins!");
        }
    }
}
