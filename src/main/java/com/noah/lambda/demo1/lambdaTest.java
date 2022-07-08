package com.noah.lambda.demo1;

/**
 * @ClassName lambdaTest
 * @Description TODO
 * @Author noah
 * @Date 2022/7/8 11:40
 * @Version 1.0
 **/
public class lambdaTest {

    public static void main(String[] args) {
        Factory entity = new FactoryEntity();
        User user = entity.getUser();
        System.out.println(user);

        //匿名内部类
        Factory factory = new Factory() {
            @Override
            public User getUser() {
                return null;
            }
        };
        System.out.println(factory.getUser());


        factory = (() -> {
            return new User("王五", 9);
        });
        System.out.println(factory.getUser());


        factory = () -> {
            return new User("李四", 8);
        };
        System.out.println(factory.getUser());


        factory = () -> new User("赵六",10);
        System.out.println(factory.getUser());
    }
}
