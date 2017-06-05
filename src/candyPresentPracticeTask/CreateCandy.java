package candyPresentPracticeTask;

import java.util.Scanner;

import static candyPresentPracticeTask.CandyType.*;

/**
 * Created by rohau.andrei on 05.06.2017.
 */
public class CreateCandy {
    public static Nestle buyNestle(){
        Nestle candy = null;
        System.out.println("Enter weight: ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("Enter price: ");
        sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("Choose type: 1. CHOCOLATE; 2. NUTS; 3. MILKY; 4. GUMMY");
        sc = new Scanner(System.in);
        int type = sc.nextInt();
        switch (type) {
            case 1:
                Nestle nestle1 = new Nestle(weight, price, CHOCOLATE);
                candy = nestle1;
                break;
            case 2:
                Nestle nestle2 = new Nestle(weight, price, NUTS);
                candy = nestle2;
                break;
            case 3:
                Nestle nestle3 = new Nestle(weight, price, MILKY);
                candy = nestle3;
                break;
            case 4:
                Nestle nestle4 = new Nestle(weight, price, GUMMY);
                candy = nestle4;
                break;
        }
        return candy;
    }

    public static Mars buyMars(){
        Mars candy = null;
        System.out.println("Enter weight: ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("Enter price: ");
        sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("Choose type: 1. CHOCOLATE; 2. NUTS; 3. MILKY; 4. GUMMY");
        sc = new Scanner(System.in);
        int type = sc.nextInt();
        switch (type) {
            case 1:
                Mars mars1 = new Mars(weight, price, CHOCOLATE);
                candy = mars1;
                break;
            case 2:
                Mars mars2 = new Mars(weight, price, NUTS);
                candy = mars2;
                break;
            case 3:
                Mars mars3 = new Mars(weight, price, MILKY);
                candy = mars3;
                break;
            case 4:
                Mars mars4 = new Mars(weight, price, GUMMY);
                candy = mars4;
                break;
        }
        return candy;
    }

    public static Spartak buySpartak(){
        Spartak candy = null;
        System.out.println("Enter weight: ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("Enter price: ");
        sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("Choose type: 1. CHOCOLATE; 2. NUTS; 3. MILKY; 4. GUMMY");
        sc = new Scanner(System.in);
        int type = sc.nextInt();
        switch (type) {
            case 1:
                Spartak spartak1 = new Spartak(weight, price, CHOCOLATE);
                candy = spartak1;
                break;
            case 2:
                Spartak spartak2 = new Spartak(weight, price, NUTS);
                candy = spartak2;
                break;
            case 3:
                Spartak spartak3 = new Spartak(weight, price, MILKY);
                candy = spartak3;
                break;
            case 4:
                Spartak spartak4 = new Spartak(weight, price, GUMMY);
                candy = spartak4;
                break;
        }
        return candy;
    }

    public static Komunarka buyKomunarka(){
        Komunarka candy = null;
        System.out.println("Enter weight: ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("Enter price: ");
        sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println("Choose type: 1. CHOCOLATE; 2. NUTS; 3. MILKY; 4. GUMMY");
        sc = new Scanner(System.in);
        int type = sc.nextInt();
        switch (type) {
            case 1:
                Komunarka komunarka1 = new Komunarka(weight, price, CHOCOLATE);
                candy = komunarka1;
                break;
            case 2:
                Komunarka komunarka2 = new Komunarka(weight, price, NUTS);
                candy = komunarka2;
                break;
            case 3:
                Komunarka komunarka3 = new Komunarka(weight, price, MILKY);
                candy = komunarka3;
                break;
            case 4:
                Komunarka komunarka4 = new Komunarka(weight, price, GUMMY);
                candy = komunarka4;
                break;
        }
        return candy;
    }

}
