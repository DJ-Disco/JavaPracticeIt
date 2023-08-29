package com.mycompany.prelim_problem_3;

import javax.swing.JOptionPane;

public class Prelim_Problem_3 {

    public static void main(String[] args) {
        Lease lease1 = new Lease();
        Lease lease2 = new Lease();
        
        lease1.setTenantName(JOptionPane.showInputDialog("Enter tenant name for lease 1:"));
        lease1.setApartmentNum(Integer.parseInt(JOptionPane.showInputDialog("Enter apartment number for lease 1:")));
        lease1.setRentAmount(Double.parseDouble(JOptionPane.showInputDialog("Enter rent amount for lease 1:")));
        lease1.setLeaseLength(Integer.parseInt(JOptionPane.showInputDialog("Enter length of lease (lease term) in months for lease 1:")));
        
        System.out.println("Lease 1 Information");
        showValues(lease1);
        System.out.println();
        System.out.println("Lease 2 Information:");
        showValues(lease2);
    }
    public static void showValues(Lease object){
        System.out.println("Name: "+object.getTenantName());
        System.out.println("Apartment Number: "+object.getApartmentNum());
        System.out.println("Rent Amount: "+object.getRentAmount());
        System.out.println("Lease Term: "+object.getLeaseLength());
        
    }
}
