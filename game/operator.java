package com.telescope.game;

import java.util.Scanner;

public class operator {
    public void randomCode() {
        boolean multi;
        boolean sum;
        boolean sub;
        boolean div;

        Scanner sc = new Scanner(System.in);

        String uInput = sc.nextLine();

        if(uInput.equals("*")) {
            multi = true;
            System.out.println("Please the first number to multiply");
            double mReply1 = sc.nextDouble();
            System.out.println("now the second...");
            double mReply2 = sc.nextDouble();
            System.out.println(mReply1 * mReply2);
        } else {
            multi = false;
        }
        if(uInput.equals("/")) {
            div = true;
            System.out.println("Please the first number to divide");
            double mReply1 = sc.nextDouble();
            System.out.println("now the second...");
            double mReply2 = sc.nextDouble();
            System.out.println(mReply1 / mReply2);
        } else {
            div = false;
        }
        if(uInput.equals("+")) {
            sum = true;
            System.out.println("Please the first number to add");
            double mReply1 = sc.nextDouble();
            System.out.println("now the second...");
            double mReply2 = sc.nextDouble();
            System.out.println(mReply1 + mReply2);
        } else {
            sum = false;
        }
        if(uInput.equals("-")) {
            sub = true;
            System.out.println("Please the first number to subtract");
            double mReply1 = sc.nextDouble();
            System.out.println("now the second...");
            double mReply2 = sc.nextDouble();
            System.out.println(mReply1 - mReply2);
        } else {
            sub = false;
        }
        System.out.println("restarting program...");

    }
}
