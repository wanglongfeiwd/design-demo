package com.lftec.design;

/**
 * @author WangLongfei
 * @Date 2019-09-09 07:21
 * @Description
 */
public class BaseMenu implements MenuDecorator {

    private Decorator decorator;

    public BaseMenu(Decorator decorator) {
        this.decorator = decorator;
    }

    public void operation() {
        System.out.println("创建基本的菜单开始");
        decorator.operation();
        System.out.println("创建基本的菜单完成");
    }
}
