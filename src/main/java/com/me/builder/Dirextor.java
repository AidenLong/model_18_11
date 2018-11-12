package com.me.builder;

// 用Dirextor指挥者类来统一组装过程
public class Dirextor {

    Builder builder = null;
    public Dirextor(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu, String mainboard, String ram) {
        this.builder.buildCpu(cpu);
        this.builder.buildMainboard(mainboard);
        this.builder.buildRam(ram);
        return builder.create();
    }
}
