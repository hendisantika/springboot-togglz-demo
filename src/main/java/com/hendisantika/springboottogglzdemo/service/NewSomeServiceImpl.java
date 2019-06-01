package com.hendisantika.springboottogglzdemo.service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-togglz-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-01
 * Time: 09:33
 */
public class NewSomeServiceImpl implements SomeService {

    @Override
    public String getSomeValue() {
        return "Value from new service implementation";
    }
}