package org.example;

// Klavyeden girilen x1 ve x2 kökleri için 2.dereceden polinomu oluşturup yazdıran program.
// 1. Kök : -1
// 1. Kök : 5
// x²4.0x-5.0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float x1,x2,ktop,kcarp;
        Scanner klavye = new Scanner(System.in);
        System.out.print("1. Kök : ");
        x1 = klavye.nextFloat();
        System.out.print("1. Kök : ");
        x2 = klavye.nextFloat();

        ktop = x1+x2;
        kcarp = x1*x2;

        if (ktop<0)
            System.out.print("\nx²+" + (-1)*ktop+"x");
        else   System.out.print("\nx²" + ktop + "x");

        if (kcarp<0)
            System.out.print(kcarp);
        else System.out.print("+" + kcarp);
    }
}