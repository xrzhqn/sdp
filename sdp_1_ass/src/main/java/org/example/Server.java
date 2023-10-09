package org.example;

public class Server extends Computer {
    // declare variables
    private String ram;
    // declare variables
    private String hdd;
    // declare variables
    private String cpu;

    // Constructor
    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    // Overriding Computer's methods
    @Override
    public String getRAM() {
        return this.ram;
    }
    // Overriding Computer's methods
    @Override
    public String getHDD() {
        return this.hdd;
    }
    // Overriding Computer's methods
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
