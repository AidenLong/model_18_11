package com.me.builder;

//商家实现了抽象的Builder类，MoonComputerBuilder类用于组装电脑
public class MoonComputerBuilder extends Builder {

    private Computer mComputer = new Computer();

    public void buildCpu(String cpu) {
        mComputer.setmCpu(cpu);
    }

    public void buildMainboard(String mainboard) {
        mComputer.setmMainboard(mainboard);
    }

    public void buildRam(String ram) {
        mComputer.setmRam(ram);
    }

    public Computer create() {
        return mComputer;
    }
}
