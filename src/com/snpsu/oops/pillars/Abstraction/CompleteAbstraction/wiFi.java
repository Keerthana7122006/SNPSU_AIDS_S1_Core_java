package com.snpsu.oops.pillars.Abstraction.CompleteAbstraction;

public interface wiFi {
    void connect();
}
class Laptop implements wiFi{
    public void connect(){

        System.out.println("Laptop connect to wiFi");
    }
}
class Phone implements wiFi{
    public void connect(){
        System.out.println("Phone connect to wiFi");
    }
}