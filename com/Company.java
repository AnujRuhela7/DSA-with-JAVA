package com;

import java.util.Scanner;

public class Company
{
    Scanner sc = new Scanner(System.in);
    int[] products = new int[3];
    int totalSale;

    void getSaleItem(Company object)
    {
        for (int j = 0; j < 3; j++)
        {
            object.products[j] = sc.nextInt();
        }
    }
    int calculateSale(Company object)
    {
        this.totalSale = 0;
        for (int i = 0; i < products.length; i++)
        {
            this.totalSale += object.products[i];
        }
        return this.totalSale;
    }
}
class SalesCalculation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Company[] salesman = new Company[5];
        for (int i = 0; i < 5; i++)
        {
            salesman[i] = new Company();
        }
        /*
        This for loop block performs the same function as performed by the method getSaleItem()
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the sales of 3 items sold by Salesman " + (i+1) + " : ");
            for (int j = 0; j < 3; j++)
            {
                salesman[i].products[j] = sc.nextInt();
            }
        }
        */
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the sales of 3 items sold by Salesman " + (i+1) + " : ");
            salesman[i].getSaleItem(salesman[i]);
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Total Sale by Salesman " + (i+1) + " = " + salesman[i].calculateSale(salesman[i]));
        }
        for (int i = 0; i < 3; i++)
        {
            int total = 0;
            for(int j=0;j<5;j++)
            {
                total = total + salesman[j].products[i];
            }
            System.out.println("Total sales of item " + (i+1) + " = " + total);
        }
    }
}