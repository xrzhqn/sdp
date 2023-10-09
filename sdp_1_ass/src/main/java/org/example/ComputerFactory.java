package org.example;

public class ComputerFactory {
    // method getComputer
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        // checking if the type is Server
        if("PC".equalsIgnoreCase(type))
            //     returning the Object for one
            return new PC(ram, hdd, cpu);
            // checking if the type is Server
        else if("Server".equalsIgnoreCase(type))
            //     returning the Object for one
            return new Server(ram, hdd, cpu);
        //otherwise return null
        return null;
    }
}
