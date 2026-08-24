package com.snpsu.oops.pillars.Abstraction.CompleteAbstraction;

interface Mom {
    void cook();
}
interface Dad{
    void cook();
}
class child implements Mom,Dad{
    public void cook(){

    }
}