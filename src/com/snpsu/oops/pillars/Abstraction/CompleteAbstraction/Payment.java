package com.snpsu.oops.pillars.Abstraction.CompleteAbstraction;

public interface Payment {
    void pay();
    default void refund(){
        System.out.println("Refund");
    }

}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment through UPI");
    }
}
class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment through Credit card");
    }
    public void refund(){
        System.out.println();
    }
}
class Cash implements Payment{
    public void pay(){
        System.out.println("Payment through Cash");
    }
}
class DriverCode{
    public static void main(String[] args) {
//        UPI upi=new UPI();
//        upi.pay();
        Payment p=new UPI();
        p.pay();
    }
}