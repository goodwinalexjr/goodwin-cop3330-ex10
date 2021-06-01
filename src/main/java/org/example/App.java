package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner money = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String o1 = money.nextLine();
        double i1 = Double.parseDouble(o1);
        System.out.print("Enter the quantity of item 1: ");
        String o11 = money.nextLine();
        int q1 = Integer.parseInt(o11);
        System.out.print("Enter the price of item 2: ");
        String o2 = money.nextLine();
        double i2 = Double.parseDouble(o2);
        System.out.print("Enter the quantity of item 2: ");
        String o22 = money.nextLine();
        int q2 = Integer.parseInt(o22);
        System.out.print("Enter the price of item 3: ");
        String o3 = money.nextLine();
        double i3 = Double.parseDouble(o3);
        System.out.print("Enter the quantity of item 3: ");
        String o33 = money.nextLine();
        int q3 = Integer.parseInt(o33);

        double t1 = i1 * q1;
        double t2 = i2 * q2;
        double t3 = i3 * q3;
        double total = t1+t2+t3;
        double tax = total * .055;
        double totalTax = total + tax;

        DecimalFormat nf = new DecimalFormat("#.00");
        System.out.println("Subtotal: " + nf.format(total));
        System.out.println("Tax: " + nf.format(tax));
        System.out.println("Total: " + nf.format(totalTax));
    }
}
