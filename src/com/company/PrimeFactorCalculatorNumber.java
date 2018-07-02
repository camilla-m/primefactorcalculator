package com.company;

import java.lang.Math;
import java.util.Scanner;

class PrimeFactorCalculatorNumber
{
    public static void CalculatePrimeFactors(int n)
    {
        while (n%2==0)
        {
            System.out.print(2 + ",");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + ",");
                n /= i;
            }
        }

        if (n > 2)
            System.out.print(n);

    }

    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number and discover its prime factors: ");
        int n = reader.nextInt();
        reader.close();
        CalculatePrimeFactors(n);
    }
}