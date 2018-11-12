package com.me.abstractFactory.factory;

import com.me.abstractFactory.computer.DesktopComputer;
import com.me.abstractFactory.computer.NotebookComputer;

public abstract class ComputerFactory {

    public abstract DesktopComputer createDesktopComputer();
    public abstract NotebookComputer createNotebookComputer();
}
