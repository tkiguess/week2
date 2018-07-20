import java.util.Random;
import java.util.Scanner;

public class week2 {
    public static void main(String[] angs) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        String foodname = "", tax = "", ajax="", bando = "", breaker, totalquant = "", totalname ="",totalpricez = "",mainblock="",gainblock="";
        int start = 1, foodquant = 0, randomizer = 0;
        double rando = 1, lando = 1, foodprice = 0, totalprice = 0, totaltax = 0;


        //tax randomizer
        randomizer = rand.nextInt(3);
        System.out.println("your tax code is: " + randomizer);
        if (randomizer == 0) {
            rando = .06;
            bando = "6.00% (Tax code = 0)";
        } else if (randomizer == 1) {
            rando = .053;
            bando = "5.30% (Tax code = 1)";
        } else if (randomizer == 2) {
            rando = .0575;
            bando = "5.75% (Tax code = 2)";
        } else if (randomizer == 3) {
            rando = 0.05;
            bando = "5.00% (Tax code = 3)";
        }


        System.out.println("========================================");
        System.out.println("Welcome to long john silver, I am going to take your order now: ");


        while (start < 2) {

            System.out.println("enter a food item you want: ");
            foodname = keyboard.next();
            totalname += foodname + "";


            System.out.println("price: ");
            foodprice = keyboard.nextDouble();
            totalprice += foodprice;
            totalpricez += foodprice + "";


            System.out.println("Taxable? Yes or No: ");
            tax = keyboard.next();
            if (tax.contains("yes")) {
                ajax = "yes";
                rando = foodprice * rando + foodprice;
            } else if (tax.contains("no")) {
                ajax = "no";
                lando = foodprice * 0.05 + foodprice;
            }totaltax += lando;

            System.out.println("Quantity:");
            foodquant = keyboard.nextInt();
            totalquant += foodquant + "";

            System.out.println("Add another item? (if done type quit to exit.)");
            breaker = keyboard.next();

            mainblock= totalname + "\t" + totalquant + "\t" + totalpricez + "\t" + ajax;
            gainblock= mainblock + "\n";

            if (breaker.contains("quit")) {
                start = 4;

            }


        }

        System.out.println("Item Name \t Quantity \t Price \t Taxable");
        System.out.println(mainblock);
        System.out.print("Sub-Total: $" + totalprice + "\n");
        System.out.println("Total rate: " + bando);
        System.out.print("Sales Tax $" + totaltax + "\n");


        System.out.println("_________________________________");
        double totaltotal = totalprice + rando;
        System.out.println("Total: " + totaltotal);

    }


}
