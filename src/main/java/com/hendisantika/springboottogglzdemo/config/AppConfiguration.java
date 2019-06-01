package com.hendisantika.springboottogglzdemo.config;

import com.hendisantika.springboottogglzdemo.service.NewSomeServiceImpl;
import com.hendisantika.springboottogglzdemo.service.OldSomeServiceImpl;
import com.hendisantika.springboottogglzdemo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.togglz.spring.proxy.FeatureProxyFactoryBean;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-togglz-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-01
 * Time: 09:31
 */
@Configuration
public class AppConfiguration {

    @Bean
    public SomeService oldSomeService() {
        return new OldSomeServiceImpl();
    }

    @Bean
    public SomeService newSomeService() {
        return new NewSomeServiceImpl();
    }

    @Bean
    public FeatureProxyFactoryBean proxiedSomeService() {
        FeatureProxyFactoryBean proxyFactoryBean = new FeatureProxyFactoryBean();
        proxyFactoryBean.setFeature(FeatureToggles.USE_NEW_SOMESERVICE.name());
        proxyFactoryBean.setProxyType(SomeService.class);
        proxyFactoryBean.setActive(this.newSomeService());
        proxyFactoryBean.setInactive(this.oldSomeService());
        return proxyFactoryBean;
    }

    @Bean
    @Primary
    public SomeService someService(@Autowired FeatureProxyFactoryBean proxiedSomeService) throws Exception {
        return (SomeService) proxiedSomeService.getObject();
    }
}