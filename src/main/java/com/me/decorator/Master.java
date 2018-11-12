package com.me.decorator;

public abstract class Master extends Swordsman {

    private Swordsman swordsman;

    public Master(Swordsman swordsman) {
        this.swordsman = swordsman;
    }

    public void attackMagic() {
        swordsman.attackMagic();
    }
}
