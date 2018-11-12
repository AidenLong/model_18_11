package com.me.concrete;

public abstract class AbstractSwordsman {

    public final void fighting() {
        //运行内功，抽象方法
        neigong();
        //调整经脉,具体方法
        meridian();
        //如果有武器则准备武器
        if(hasWeapons()) {
            weapons();
        }
        //使用招式
        moves();
        //钩子方法
        hook();
    }

    //空实现方法
    protected void hook(){}
    protected abstract void neigong();
    protected abstract void weapons();
    protected abstract void moves();
    protected void meridian(){
        System.out.println("开通正经与奇经");
    }

    /**
     * 是否有武器，默认是有武器的，钩子方法
     * @return
     */
    protected boolean hasWeapons(){
        return true;
    }
}
