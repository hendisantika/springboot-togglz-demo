package com.hendisantika.springboottogglzdemo.controller;

import com.hendisantika.springboottogglzdemo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-togglz-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-01
 * Time: 09:35
 */
@RestController
@RequestMapping(value = "/api")
public class DemoResource {

    @Autowired
    private SomeService someService;
}
