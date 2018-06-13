package org.umssdiplo.automationv01.factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        Computer computer = null;

        if("PC".equalsIgnoreCase(type)){
            computer= new PC(ram, hdd, cpu);
        }
        if("Server".equalsIgnoreCase(type)){
            computer= new Server(ram, hdd, cpu);
        }
        return computer;
    }
}
