package com.example;
//RELAYO_L2A2P3
import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args ) {
        String input1,input2;
        double side1,side2;

        input1 = JOptionPane.showInputDialog("Enter length of side1:");
        input2 = JOptionPane.showInputDialog("Enter length of side2:");

        side1 = Double.parseDouble(input1);
        side2 = Double.parseDouble(input2);

        System.out.println("side1 value: " + side1);
        System.out.println("side2 value: " + side2);
        System.out.println("Hypotenuse: " + hypo(side1,side2));

    }
    public static double hypo(double side1, double side2) {

        return Math.sqrt((side1*side1)+(side2*side2));

    }
}
