package org.example;

public abstract class Computer {
    // declare abstract variable
    public abstract String getRAM();
    // declare abstract variable
    public abstract String getHDD();
    // declare abstract variable
    public abstract String getCPU();
    // Overriding the Object's method
    @Override
    public String toString(){
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
