package com.me.abstractFactory.factory;

import com.me.abstractFactory.computer.DesktopComputer;
import com.me.abstractFactory.computer.LenovoDesktopComputer;
import com.me.abstractFactory.computer.LenovoNotebookComputer;
import com.me.abstractFactory.computer.NotebookComputer;

public class LenovoFactory extends ComputerFactory {
    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new LenovoNotebookComputer();
    }
}
