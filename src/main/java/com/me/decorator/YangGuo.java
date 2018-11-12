package com.me.decorator;

// 组件具体实现类（ConcreteComponent）
public class YangGuo extends Swordsman {
    @Override
    public void attackMagic() {
        System.out.println("杨过使用全真剑法");
    }
}
