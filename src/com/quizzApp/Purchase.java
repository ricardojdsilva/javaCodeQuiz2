package com.quizzApp;

public class Purchase {

    //fields

    private double sales_amout = 0.00;
    private int qty_items = 0;
    private double SALES_TAX = 8.25;

    //default constructor
    public Purchase()
    {
    }

    // Constructor with param
    public Purchase(double SalesValue, int items)
    {

        sales_amout = SalesValue;
        qty_items = items;
    }

    //method to calc the tax sales
    public double CalculateSalesTax ()
    {

        return (sales_amout * SALES_TAX) / 100;
        //return 100.00;

    }

    //method to calc th shipping
    public double CalculateShippingCharges()
    {

        if (qty_items < 3)
        {
            return 3.50;

        }
        else if (qty_items >= 3 && qty_items < 7)
        {
            return 5.00;
        }
        else if (qty_items > 6 && qty_items <= 10)
        {
            return 5.50;
        }
        else if (qty_items > 10 && qty_items <= 15)
        {
            return 7.50;
        }

        else if (qty_items > 15)
        {
            return 11.00;
        }
        else
            return 0.00;


    }

    //method to calc the total
    public double totalAmout()
    {
        return sales_amout + CalculateShippingCharges() + CalculateSalesTax();
    }

    public String purchaseDetails() {
        return "Purchase details " +
                "\nSales amount: " + String.format("%.2f", sales_amout) +
                "\nSales Tax: " + SALES_TAX + "%" +
                "\nSales tax amount: " + String.format("%.2f",CalculateSalesTax()) +
                "\nShipping charges: " + String.format("%.2f",CalculateShippingCharges()) +
                "\nTotal amount : " + String.format("%.2f",totalAmout());

    }

}
