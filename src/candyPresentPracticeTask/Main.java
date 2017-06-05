package candyPresentPracticeTask;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * Created by rohau.andrei on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hi make ur own sweet present!!");

        LinkedList<Candy> present = new LinkedList<>();
        int totalPrice = 0;
        int totalWeight = 0;
        mainMenu(present, totalPrice, totalWeight);

    }

    public static void mainMenu(LinkedList<Candy> present, int totalPrice, int totalWeight) {
        System.out.println("Choose option:" +
                "\n1. Buy Nestle candy" +
                "\n2. Buy Mars candy" +
                "\n3. Buy Spartak candy" +
                "\n4. Buy Komunarka candy" +
                "\n5. Count price and weight" +
                "\n6. Quit");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        switch (answer) {
            case 1:
                try {
                    Candy e = CreateCandy.buyNestle();
                    present.add(e);
                } catch (NullPointerException e) {
                    System.out.println("Could not buy! Programme works incorrectly!");
                }
                mainMenu(present, totalPrice, totalWeight);
                break;
            case 2:
                try {
                    Candy e = CreateCandy.buyMars();
                    present.add(e);
                } catch (NullPointerException e) {
                    System.out.println("Could not buy! Programme works incorrectly!");
                }
                mainMenu(present, totalPrice, totalWeight);
                break;
            case 3:
                try {
                    Candy e = CreateCandy.buySpartak();
                    present.add(e);
                } catch (NullPointerException e) {
                    System.out.println("Could not buy! Programme works incorrectly!");
                }
                mainMenu(present, totalPrice, totalWeight);
                break;
            case 4:
                try {
                    Candy e = CreateCandy.buyKomunarka();
                    present.add(e);
                } catch (NullPointerException e) {
                    System.out.println("Could not buy! Programme works incorrectly!");
                }
                mainMenu(present, totalPrice, totalWeight);
                break;
            case 5:
                try {
                    for (Candy e : present) {
                        totalPrice += e.getPrice();
                        totalWeight += e.getWeight();
                    }
                    System.out.println("Total price: " + totalPrice + ". Total weight: " + totalWeight);
                    System.out.println("That's ur present! Bye!");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Could not buy! Programme works incorrectly!");
                }
                break;
            case 6:
                System.out.println("Come back!");
                break;
        }
    }
}
