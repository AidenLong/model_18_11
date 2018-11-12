package com.me.proxy;

//我找的代理类同样也要实现IShop接口，并且要持有被代理者，在buy()方法中调用了被代理者的buy()方法：
public class Purchasing implements IShop {
    private IShop mShop;

    public Purchasing(IShop shop) {
        mShop = shop;
    }

    @Override
    public void buy() {
        mShop.buy();
    }
}
