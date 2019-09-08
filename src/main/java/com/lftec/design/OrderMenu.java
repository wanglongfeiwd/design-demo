package com.lftec.design;

/**
 * @author WangLongfei
 * @Date 2019-09-09 07:26
 * @Description
 */
public class OrderMenu implements MenuDecorator {

    private Decorator decorator;

    public OrderMenu(Decorator decorator) {
        this.decorator = decorator;
    }

    public void operation() {

        System.out.println("创建订单菜单开始");
        decorator.operation();
        System.out.println("创建订单菜单完成");

    }
}
