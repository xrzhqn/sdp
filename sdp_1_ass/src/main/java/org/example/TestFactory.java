package org.example;

public class TestFactory {
    public static void main(String[] args) {
        // Creating object of Computer and parameterizing them
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        // Creating object of Computer and parameterizing them
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");

        // Output of the result
        System.out.println("Factory PC Config::" + pc);
        // Output of the result
        System.out.println("Factory Server Config::" + server);
    }
}
