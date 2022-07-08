package com.noah.lambda.demo1;

/**
 * @ClassName FactoryEntity
 * @Description TODO
 * @Author noah
 * @Date 2022/7/8 11:39
 * @Version 1.0
 **/
public class FactoryEntity implements Factory{
    @Override
    public User getUser() {
        return new User("张三",12);
    }
}
