package com.hendisantika.springboottogglzdemo.config;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-togglz-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-01
 * Time: 09:34
 */
public enum FeatureToggles implements Feature {

    @Label("New Elastic Search Backend replacing RDBMS for text-based searches.")
    TEXT_BASED_SEARCH_VIA_ELASTIC_SEARCH,

    @Label("New content retrieval via CMS instead of text files.")
    CONTENT_RETRIEVAL_VIA_CMS,

    @Label("New some service.")
    USE_NEW_SOMESERVICE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}