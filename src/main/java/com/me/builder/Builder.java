package com.me.builder;

//创建Builder类规范产品的组建
public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildMainboard(String mainboard);
    public abstract void buildRam(String ram);

    public abstract Computer create();
}
