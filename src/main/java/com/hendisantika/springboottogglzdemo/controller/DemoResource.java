package com.hendisantika.springboottogglzdemo.controller;

import com.hendisantika.springboottogglzdemo.config.FeatureToggles;
import com.hendisantika.springboottogglzdemo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/demo-es/{id}")
    public String getDemoEs(@PathVariable("id") String id) {
        if (FeatureToggles.TEXT_BASED_SEARCH_VIA_ELASTIC_SEARCH.isActive()) {
            return "New ElasticSearch Backend is active";
        }
        return "Still relying in existing / legacy RDBMS backend implementation";
    }
}
