package program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//                                   GIVEN THE DATA BELOW!
//                ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//                                       Distance = Fee
//                                     0 -  5 miles  = $2
//                                     6 - 15 miles  = $5
//                                     16 - 25 miles = $10
//                                     26 - 50 miles = $15
//                                More than 50 miles = $20
//                +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        String product; //Rice
//        int qty; // 20
        double feeForMiles = 0; // $5.00
         double miles = 0;
 //      "Thank you. Come Again!!!"






        Scanner scanner = new Scanner(System.in);
        System.out.println("What did you want to buy? ");
        String product = scanner.nextLine();
        System.out.println(" Very nice, how many did you want? ");
        double qty = scanner.nextDouble();
        System.out.println(" How many miles did you travel? ");
        double numOfMiles = scanner.nextDouble();
        System.out.println(" Ahh I understand.");


        if (miles >=0 && miles < 5 ){
            feeForMiles = 2;
        }else if(miles >=6 && miles < 15 ){
            feeForMiles = 5;
        }else if (miles >=16 && miles < 25 ){
            feeForMiles = 10;
        }else if (miles >=26 && miles < 50 ){
            feeForMiles = 15;
        }else {feeForMiles = 20;}
        double total = (feeForMiles * miles) + (qty * feeForMiles);
        System.out.println(" Product      Qty      Price       Miles      Total");

        System.out.println(" "+ product + "         " + qty + "       "  + feeForMiles + "        " + numOfMiles +  "       "  + total);

        System.out.println("-------      -----     ------      ------     --------");

        System.out.println(" Thank you. Come Again!!!");




    }
}