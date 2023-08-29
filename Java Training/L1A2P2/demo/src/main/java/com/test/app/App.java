package com.test.app;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args ){
        int base, exponent;
        String input;

        input = JOptionPane.showInputDialog("Input the base:");
        base = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Input the exponent:");
        exponent = Integer.parseInt(input);

        System.out.print(base+" raised to "+exponent+" is "+integerPower(base, exponent));


    }
    public static int integerPower(int base, int exponent){
        int result = 1;
        for (int i=0;i<exponent;i++) {
            result *= base;
        }
        return result;
    }
}
