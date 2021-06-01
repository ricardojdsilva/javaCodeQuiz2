package com.quizzApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        purchaseApp();

    }


    //method purchase

    public static void purchaseApp() {

        //Declare variable
        double vSaleAmout = 0.0;
        int vNumber_itens_purchase = 0;
        String isEnough = "n";
        Scanner sc = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter the sales amount: ");

        vSaleAmout += sc.nextDouble();


        System.out.print("Enter number of items purchased: ");
        vNumber_itens_purchase += sc.nextInt();

        while (isEnough.equals("n"))
        {
            System.out.print("is Enough ? (y/n) ");

            isEnough = sc.next();

            if (isEnough.equals("y")) {
                break;
            }

            System.out.print("Enter the sales amount: ");

            vSaleAmout += sc.nextDouble();

            System.out.print("Enter number of items purchased: ");
            vNumber_itens_purchase += sc.nextInt();

        }

        Purchase objPurchase = new Purchase(vSaleAmout, vNumber_itens_purchase);
        System.out.println(objPurchase.purchaseDetails());
        sc.close();

    }



}
