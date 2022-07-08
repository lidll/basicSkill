package com.noah.lambda.demo1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author noah
 * @Date 2022/7/8 11:29
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String name;
    private int age;
    
}
