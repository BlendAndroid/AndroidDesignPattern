package com.blend.androiddesignpattern.p_mediator;

public abstract class Mediator {

    /**
     同事对象改变时通知中介者的方法
     在同事对象改变时由中介者去通知其他的同事对象
     */
    public abstract void changed(Colleague colleague);

}
