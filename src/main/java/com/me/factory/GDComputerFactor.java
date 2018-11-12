package com.me.factory;

public class GDComputerFactor extends  ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clazz) {
        Computer computer = null;
        String className = clazz.getName();
        try {
            computer = (Computer) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
