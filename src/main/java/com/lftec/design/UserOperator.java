package com.lftec.design;

/**
 * @author WangLongfei
 * @Date 2019-09-09 07:28
 * @Description
 */
public class UserOperator implements Decorator {


    public void operation() {
        System.out.println("创建基础用户信息");
    }


    public static void main(String[] args) {

        UserOperator userOperator = new UserOperator();
        BaseMenu baseMenu = new BaseMenu(userOperator);
        OrderMenu orderMenu = new OrderMenu(baseMenu);

        orderMenu.operation();

        System.out.println("测试完成");
    }
}
