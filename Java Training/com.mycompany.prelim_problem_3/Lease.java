package com.mycompany.prelim_problem_3;

public class Lease {
    
    //datafields
    private String tenantName;
    private int apartmentNum;
    private double rentAmount;
    private int leaseLength;
    
    //constructor
    Lease(){
        tenantName = "NoName";
        apartmentNum = 0;
        rentAmount = 5000;
        leaseLength = 12;
    }
    
    //getters
    public String getTenantName(){
        return tenantName;
    }
    public int getApartmentNum(){
        return apartmentNum;
    }
    public double getRentAmount(){
        return rentAmount;
    }
    public int getLeaseLength(){
        return leaseLength;
    }
    
    //setters
    public void setTenantName(String tenantName){
        this.tenantName = tenantName;
    }
    public void setApartmentNum(int apartmentNum){
        this.apartmentNum = apartmentNum;
    }
    public void setRentAmount(double rentAmount){
        this.rentAmount = rentAmount;
    }
    public void setLeaseLength(int leaseLength){
        this.leaseLength = leaseLength;
    }
    
}
