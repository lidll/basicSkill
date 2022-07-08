package com.noah.lambda.demo2;

import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.util.function.Consumer;

/**
 * @ClassName ConsumerLambda
 * @Description TODO
 * @Author noah
 * @Date 2022/7/8 14:46
 * @Version 1.0
 **/
public class ConsumerLambda {

    public static void main(String[] args) {
        getConsumer(s -> System.out.println(s), "aaa");
        consumerThen(
                s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()),
                "bbbAAA"
        );
    }


    static void getConsumer(Consumer<String> consumer, String msg) {
        consumer.accept(msg);
    }

    static void consumerThen(Consumer<String> before, Consumer<String> after, String msg) {
        before.andThen(after).accept(msg);
    }
}
