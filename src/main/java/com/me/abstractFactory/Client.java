package com.me.abstractFactory;

import com.me.abstractFactory.factory.ComputerFactory;
import com.me.abstractFactory.factory.HpFactory;
import com.me.abstractFactory.factory.LenovoFactory;

public class Client {

    public static void main(String[] args) {
        ComputerFactory lenocoFactory=new LenovoFactory();
        lenocoFactory.createDesktopComputer().start();
        lenocoFactory.createNotebookComputer().start();

        ComputerFactory hpFactory=new HpFactory();
        hpFactory.createDesktopComputer().start();
        hpFactory.createNotebookComputer().start();
    }
}
