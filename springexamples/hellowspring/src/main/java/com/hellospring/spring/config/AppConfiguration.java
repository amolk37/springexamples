package com.hellospring.spring.config;

import com.hellospring.spring.lang.Language;
import com.hellospring.spring.lang.impl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by BK93287 on 2/7/2017.
 */
@Configuration
@ComponentScan({"com.hellospring.spring.bean"})
public class AppConfiguration {

    @Bean(name ="language")
    public Language getLanguage() {

        return new Vietnamese();
    }
}
